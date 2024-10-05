CREATE TABLE history_medical (
    id SERIAL PRIMARY KEY,
    patient_id INTEGER,
    date DATE,
    description VARCHAR(100),
    FOREIGN KEY (patient_id) REFERENCES patient(id)
);