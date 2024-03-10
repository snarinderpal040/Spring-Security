use springpractise;

create table users(
    username varchar(50) not null,
    password varchar(500) not null,
    enabled boolean not null,
    primary key (username)
);

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);

insert into users values ('narinder', 'password', true)
insert into authorities values ('narinder', 'ADMIN')

insert into users values ('harman', 'password', true)
insert into authorities values ('harman', 'USER')