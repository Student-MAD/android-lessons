# Уроки по android-разработке
В этом репозитории будут выкладываться исходники проектов от уроков по android-разработке, дополнительные материалы к ним, а также домашние задания (ниже). Замечу, что здесь будет только текст заданий, инструкции по отправке и ревью заданий находятся в репозитории [android-homeworks](https://github.com/Student-MAD/android-homeworks).

## Задание по занятию 10 - "REST API"
Дополнить приложение TodoApp. Удалить локальную базу данных из приложения. Добавить вместо нее взаимодействие с сервером при входе и регистрации, а также при действиях с заметками, опираясь на спецификацию API.

Особенности:
- При входе и регистрации сервер возвращает токен авторизации, он идентифицирует пользователя и с его помощью осуществляется доступ к защищенным данным пользователя (заметкам). Токен необходимо подставлять в заголовок защищенного запроса с именем "Authorization" и значением "Bearer /токен/" (без слэшей). Также токен необходимо хранить локально и ориентироваться по нему, выполнен ли вход в приложение. При выходе необходимо удалять токен из локального хранилища.
- На сервере присутствует метод удаления заметок, необходимо реализовать в приложении эту функцию по долгому нажатию на заметку.
- Так как на сервер необходимо отправлять параметры при создании заметки, добавить в приложение экран добавления заметки.
- При отправке всех запросов обязятельно учесть сценарий с ошибкой при выполнении запроса (самый простой способ вызвать ошибку - отключить интернет).

Дополнительные материалы:
- [Спецификация API](https://app.swaggerhub.com/apis/MegaR1CK/TodoAPI/1.0.0)
- [Статья по теме занятия (последняя часть статьи не по теме, ее не смотрим)](https://habr.com/ru/post/485618/)
- [Сборник публичных API](https://github.com/public-apis/public-apis)

## Задание по занятию 9 - "Локальное хранение данных."
Дополнить приложение TodoApp. Реализовать функцию сохранения состояния входа, то есть сделать так, чтобы при выполнении входа в аккаунт, выходе из приложения и последующем запуске переход осуществлялся сразу на домашний экран, минуя сплэш и вход. Если же вход не был выполнен или пользователь вышел из аккаунта в предыдущей сессии, следовать стандартному порядку экранов.

Реализовать локальное хранение и добавление задач в базе данных SQLite.

## Задание по занятию 8 - "Коллекции. Меню тулбара."
Дополнить приложение TodoApp. Добавить желтый тулбар на домашний экран. Заменить кнопку выхода на соответствующий пункт меню в тулбаре. Перенести на этот пункт соответствующий функционал.

## Задание по занятию 7 - "Интерфейсы. Боковое меню навигации."
Заменить нижнее меню навигации в приложении TodoApp на аналогичное ему боковое.

## Задание по занятию 6 - "Классы данных. Списковые представления."([запись](https://drive.google.com/file/d/147x1VP1pBb4NEtW1kNpNHBzX39b_rKd5/view?usp=sharing))
Дополнить приложение TodoApp. На экран задач добавить список задач с соответствии с [макетом](https://www.figma.com/file/o1vbqVdvvFDiBYfIDkiior/To-Do-Mob-App-(Community)-(Copy)?node-id=1%3A233). Список генерировать программно. Добавить FAB для добавления новых задач. Заголовок задачи должен размещаться в одну строку, если не умещается, обрезать в многоточие. Время созданной с помощью кнопки задачи должно быть текущим. Время сгенерированной задачи может быть любым.

Дополнительные материалы: [работа с датами](https://www.ictdemy.com/kotlin/oop/date-and-time-in-kotlin-creating-and-formatting), [еще работа с датами](https://www.baeldung.com/kotlin/dates)

## Задание по занятию 5 - "ViewPager. AppBarLayout."([запись](https://drive.google.com/file/d/1pPW5AgFPNnKVPufKwJgw0CKazX-xLhCQ/view?usp=sharing))
Дополнить приложение TodoApp. На экран профиля добавить CollapsingAppBarLayout. В развернутом состоянии он должен выглядеть как сейчас, в свернутом в виде тулбара, залитого белым цветом. Приветствие перенести из TextView в заголовок аппбара, чтобы он отображался во всех состояниях. Добавить во фрагмент задач ViewPager2 + табы. Должно быть три страницы - "Работа", "Развлечения", "Учеба". На страницах разместить TextView с названием категории.

## Задание по занятию 4 - "Фрагменты. Элемент BottomNavigationView."([запись](https://drive.google.com/file/d/1GvsAF3DMv32xdtq30mhWtzYWr3Icn0ob/view?usp=sharing))
Дополнить ранее созданное приложение TodoApp. На главный экран добавить bottomNavigationView с двумя пунктами - Profile и Tasks (иконки назначить по своему вкусу). Интерфейс и логику профиля перенести во фрагмент и связать с ним bottomNavigationView. Добавить второй фрагмент Tasks, разместить в нем надпись "TasksList". Почту пользователя также получать в активности и передавать в ProfileFragment.

ВАЖНО: правила именования для фрагментов и их макетов такие же, как и для активностей (...Fragment.kt, fragment_....xml).

## Задание по занятию 3 - "Переходы между активностями. Жизненный цикл активности." от 23.10.2021 ([запись](https://drive.google.com/drive/u/3/folders/1DRnmnstJrUR4lveZ80fI3Lk-avfojl4X))

Дополнить созданное ранее приложение TodoApp с макетом экрана входа и валидацией. Создать остальные активности (Get Started, Register, Profile) и сверстать их макеты, если не сделали этого ранее (нижнюю часть в Profile не делать). Добавить валидацию на экран регистрации. Добавить систему переходов между активностями в соответствии со списком ниже:
- С GetStartedActivity можно перейти на LoginActivity по кнопке GetStarted.
- С LoginActivity можно перейти на RegisterActiivity по нажатию на текст "Sign Up" и на ProfileActivity по нажатию кнопки "Sign In" (предварительно пройдя валидацию).
- С RegisterActivity можно перейти на loginActivity по нажатию на текст "Sign In" и на ProfileActivity по нажатию кнопки "Register" (предварительно пройдя валидацию).
- С ProfileActivity можно перейти на предыдущую активность (Login/Register), по иконке выхода в верхнем правом углу. Догадайтесь сами, как это реализовать.

Также необходимо передавать с экрана входа или регистрации в профиль почту пользователя и отображать ее через строку с параметром.
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
