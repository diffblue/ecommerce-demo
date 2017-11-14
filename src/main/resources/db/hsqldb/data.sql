-- Copyright 2016-2017 DiffBlue limited. All rights reserved.
-- Sample data for testing / demo purposes

-- Categories
INSERT INTO categories(name) VALUES ('Apparel');
INSERT INTO categories(name) VALUES ('Pins');
INSERT INTO categories(name) VALUES ('Stickers');
INSERT INTO categories(name) VALUES ('Prints');

-- Collections
INSERT INTO collections(name) VALUES ('Arrow');
INSERT INTO collections(name) VALUES ('Desktop icon');
INSERT INTO collections(name) VALUES ('Floppy disc');
INSERT INTO collections(name) VALUES ('Game cartridge');
INSERT INTO collections(name) VALUES ('GameLad');
INSERT INTO collections(name) VALUES ('Joypad');
INSERT INTO collections(name) VALUES ('Pointer');
INSERT INTO collections(name) VALUES ('Stiffy disc');
INSERT INTO collections(name) VALUES ('Waiting');

-- Products
INSERT INTO products(sku, category_id, collection_id, name, price, description) VALUES ('PROD001', (SELECT id from categories where name='Apparel'),(SELECT id from collections where name='Floppy disc'),'foo', '9.99','description1');
INSERT INTO products(sku, category_id, collection_id, name, price, description) VALUES ('PROD002', (SELECT id from categories where name='Pins'),(SELECT id from collections where name='GameLad'),'bar','5.99','description2');
