-- Copyright 2016-2017 DiffBlue limited. All rights reserved.
-- Sample data for testing / demo purposes

-- Categories
INSERT INTO categories(name) VALUES ('Apparel');
INSERT INTO categories(name) VALUES ('Pins');
INSERT INTO categories(name) VALUES ('Stickers');
INSERT INTO categories(name) VALUES ('Prints');

-- Products
INSERT INTO products(sku, category_id, name, price, description) VALUES ('PROD001', (SELECT id from categories where name='Apparel'),'foo', '9.99','description1');
INSERT INTO products(sku, category_id, name, price, description) VALUES ('PROD002', (SELECT id from categories where name='Pins'),'bar','5.99','description2');
