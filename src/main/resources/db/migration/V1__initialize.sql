create table department
(
    id   bigserial primary key,
    name varchar(32) -- имя, может содержать кириллицу. Не превышает 32 символов в длину
);
create table employee
(
    id            bigserial primary key,            -- уникальный целочисленный идентификатор.
    hire_time     date,                             -- дата и время принятия сотрудника на работу.
    fired_time    date,                             -- дата и время "увольнения" сотрудника.
    department_id bigint references department (id) -- идентификатор отдела, в котором он состоит
);



insert into department (name)
values ('Department'),
       ('Department1'),
       ('Department2'),
       ('Department3'),
       ('Department4'),
       ('Department5'),
       ('Department6'),
       ('Department7'),
       ('Department8'),
       ('Department9'),
       ('Department10');
