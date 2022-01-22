Запуск найма и увольнения сотрудников происходит по endpoint GET http://localhost:8189/hiring/api/v1/start
Посмотреть департаменты GET http://localhost:8189/hiring/api/v1/depart
Получить сотрудников GET http://localhost:8189/hiring/api/v1/pers

При каждом найме информация о найме отправляется на http://localhost:8289/logger/api/v1/hiring
При каждом увольнение информация об уволеном отправляется на http://localhost:8289/logger/api/v1/firing