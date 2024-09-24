CREATE TABLE task (
    id UUID PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    status INTEGER,
    score INTEGER
);