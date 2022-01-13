package com.kgoncharov.recyclerview

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseManager(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "my_database"
        private const val DATABASE_VERSION = 2
        private const val TABLE_NAME_USERS = "USERS"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NAME_USERS(id INTEGER PRIMARY KEY AUTOINCREMENT, FIRSTNAME TEXT, LASTNAME TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion < 2) {
            db?.execSQL("ALTER TABLE $TABLE_NAME_USERS ADD COLUMN PHONE TEXT")
        }
    }

    fun insertUser(user: User) {
        writableDatabase.insert(
            TABLE_NAME_USERS,
            null,
            ContentValues().apply {
                put("FIRSTNAME", user.firstName)
                put("LASTNAME", user.lastName)
            }
        )
    }

    fun updateUser(id: Int, user: User) {
        writableDatabase.update(
            TABLE_NAME_USERS,
            ContentValues().apply {
                put("FIRSTNAME", user.firstName)
                put("LASTNAME", user.lastName)
            },
            "id = ?",
            arrayOf(id.toString())
        )
    }

    fun deleteUser(id: Int) {
        writableDatabase.delete(
            TABLE_NAME_USERS,
            "id = ?",
            arrayOf(id.toString())
        )
    }

    fun getUsers(): List<User> {
        val cursor = readableDatabase.query(TABLE_NAME_USERS,
            arrayOf("id", "FIRSTNAME", "LASTNAME"), null, null, null, null, null)
        val users = mutableListOf<User>()
        with(cursor) {
            if (moveToFirst()) {
                do {
                    users.add(
                        User(
                            id = getInt(getColumnIndexOrThrow("id")),
                            firstName = getString(getColumnIndexOrThrow("FIRSTNAME")),
                            lastName = getString(getColumnIndexOrThrow("LASTNAME"))
                        )
                    )
                } while (moveToNext())
            }
            close()
        }
        close()
        return users
    }

    fun getUser(id: Int): User? {
        val cursor = readableDatabase.query(TABLE_NAME_USERS,
            arrayOf("id", "FIRSTNAME", "LASTNAME"), "id = ?", arrayOf(id.toString()), null, null, null)
        var user: User? = null
        with(cursor) {
            if (moveToFirst()) {
                user = User(
                    id = getInt(getColumnIndexOrThrow("id")),
                    firstName = getString(getColumnIndexOrThrow("FIRSTNAME")),
                    lastName = getString(getColumnIndexOrThrow("LASTNAME"))
                )
            }
        }
        return user
    }
}