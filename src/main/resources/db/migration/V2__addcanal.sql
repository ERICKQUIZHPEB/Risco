CREATE TABLE IF NOT EXISTS canal(
    id SERIAL,
    zona_id INT,
    description VARCHAR(45)NOT NULL,
    num_gate INT,
    schedule TIME,
    PRIMARY KEY (id),
    FOREIGN KEY(zona_id) REFERENCES zona(id)
    );
