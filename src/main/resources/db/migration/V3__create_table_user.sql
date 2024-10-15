CREATE TABLE epicuser (
    id UUID PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    avatar VARCHAR(255),
    score INTEGER DEFAULT 0
);