create table `exam`.`user`
(
    `id`   bigint auto_increment
        primary key,
    `name` varchar(255) not null unique
);