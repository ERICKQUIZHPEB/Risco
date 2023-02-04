CREATE TABLE IF NOT EXISTS gate(
    id SERIAL,
    canal_id INT,
    code VARCHAR(50) NOT NULL,
    description VARCHAR(45)NOT NULL,
    schedule TIME,
    PRIMARY KEY (id),
    UNIQUE(code),
    FOREIGN KEY(canal_id) REFERENCES canal(id)
    );
