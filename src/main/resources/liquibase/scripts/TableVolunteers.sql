-- liquibase formated sql

--changeset Igor:1
CREATE TABLE volunteers(
id SERIAL,
name TEXT,
nickName TEXT,
year INTEGER,
workingFirstTime TIMESTAMP,
workingLastTime TIMESTAMP
)