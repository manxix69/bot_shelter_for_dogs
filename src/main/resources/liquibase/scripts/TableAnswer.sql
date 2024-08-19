-- liquibase formated sql

-- changeset Igor:1
CREATE TABLE answer(
id SERIAL,
command TEXT,
message TEXT
)