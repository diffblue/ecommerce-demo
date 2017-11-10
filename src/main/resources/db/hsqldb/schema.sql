-- Copyright 2016-2017 DiffBlue limited. All rights reserved.
DROP TABLE products IF EXISTS;

-- Create table to hold information about the products
CREATE TABLE products (
    id      INTEGER IDENTITY PRIMARY KEY,
    sku     VARCHAR(30) NOT NULL UNIQUE,
    name    VARCHAR(30) NOT NULL,
    price   DECIMAL(20,2) NOT NULL,
    description VARCHAR(30) NOT NULL
);

