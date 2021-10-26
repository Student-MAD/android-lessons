# Уроки по android-разработке
В этом репозитории будут выкладываться исходники проектов от уроков по android-разработке, дополнительные материалы к ним, а также домашние задания (ниже). Замечу, что здесь будет только текст заданий, инструкции по отправке и ревью заданий находятся в репозитории [android-homeworks](https://github.com/Student-MAD/android-homeworks).

## Задание по занятию 3 - "Переходы между активностями. Жизненный цикл активности." от 23.10.2021 ([запись](https://drive.google.com/file/d/12KCXTnErWW6qIpCuK_cidFvakODzgkyf/view))

Дополнить созданное ранее приложение TodoApp с макетом экрана входа и валидацией. Создать остальные активности (Get Started, Register, Profile) и сверстать их макеты, если не сделали этого ранее (нижнюю часть в Profile не делать). Добавить валидацию на экран регистрации. Добавить систему переходов между активностями в соответствии со списком ниже:
- С GetStartedActivity можно перейти на LoginActivity по кнопке GetStarted.
- С LoginActivity можно перейти на RegisterActiivity по нажатию на текст "Sign Up" и на ProfileActivity по нажатию кнопки "Sign In" (предварительно пройдя валидацию).
- С RegisterActivity можно перейти на loginActivity по нажатию на текст "Sign In" и на ProfileActivity по нажатию кнопки "Register" (предварительно пройдя валидацию).
- С ProfileActivity можно перейти на предыдущую активность (Login/Register), по иконке выхода в верхнем правом углу. Догадайтесь сами, как это реализовать.

Замечу, что это и все последующие задания вы загружаете в свой форкнутый репозиторий android-homeworks и создаете пулл реквест в [основной репозиторий](https://github.com/Student-MAD/android-homeworks).

## Задание по занятию 2 - "Базовая логика приложения" от 16.10.2021
Дополнить созданное ранее приложение TodoApp с макетом экрана входа. Реализовать логику валидации данных (почты и пароля) по нажатию на кнопку входа. 
Правила валидации:
- поля не должны быть пустыми (подсказка: можно сделать через метод isEmpty класса String);
- почта должна содержать как минимум 7 символов и собаку (@);
- пароль должен быть не короче 8 символов.

Логику валидации вынести в отдельный класс (напр. Validator.kt). При успешной валидации показать Toast с текстом "Success!". При непрохождении хотя бы одного условия отображать ошибку в соответствующем поле ввода.

## Задание по занятию 1 - "Элементы пользовательского интерфейса" от 9.10.2021
Создать новое android-приложение TodoApp. Сверстать экран Login в соответствии с [дизайном](https://www.figma.com/file/JaAxJ6PN4XzNgwHlhjZliD/To-Do-Mob-App-(Community)?node-id=1%3A182). Верстку добавлять в файл макета основной активности. Поля ввода можно оставить стандартные, их дизайн будем проходить позже.
