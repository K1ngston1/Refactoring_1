# Зауваження щодо коду

## 1. Проблеми з інкапсуляцією
- Поля `W`, `H` та `imb` повинні бути `private`, щоб забезпечити контроль доступу.
- `imb` не повинно бути статичним (`static`), оскільки воно відноситься до конкретного об'єкта.

## 2. Логічні помилки та покращення
- Використання `&` замість `&&` у `if`-виразах (використання `&` є зайвим, бо немає потреби в побітовій операції).
- Метод `Result()` є статичним, що некоректно, адже він використовує значення `imb`, яке змінюється для кожного об'єкта.
- Метод `takeImt()` також має бути нестатичним.

## 3. Код-стайл
- Імена класів мають починатися з великої літери та відповідати CamelCase: `humanIMB` → `HumanIMB`.
- Імена методів у Java починаються з малої літери: `Result()` → `getResult()`, `takeImt()` → `getIMB()`.
- Пробіли та форматування не відповідають стандартному Java-кодуванню.
- Назва конструктора має починатися з великої літери: `humanIMB()` → `HumanIMB()`.

## 4. Оптимізація коду
- Можна використовувати `switch` або `if-else` для більшої читабельності `Result()`.
- Додати конструктор без параметрів для зручності.
- Реалізувати метод `toString()`, щоб спростити вивід інформації.

## 5. Відокремлення логіки
- Обчислення `imb` можна винести в окремий метод `calculateIMB()`.
- `putW()` та `putH()` мають викликати `calculateIMB()`, щоб не дублювати код.
