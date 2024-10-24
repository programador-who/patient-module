CREATE TABLE patient
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    cpf     VARCHAR(11)  NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone   VARCHAR(20)
);