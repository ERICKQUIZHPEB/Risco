CREATE TABLE IF NOT EXISTS zona(
    id SERIAL,
    code VARCHAR(45)NOT NULL,
    fullname VARCHAR(100),
    description VARCHAR (100),
    PRIMARY KEY (id),
    UNIQUE(code)
    );
