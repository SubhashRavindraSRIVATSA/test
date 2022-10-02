-- Category table data
INSERT INTO `hisabji_db`.`category` (`id`, `name`, `text`) VALUES ('1', 'Food', 'food is essential for everyone');
INSERT INTO `hisabji_db`.`category` (`id`, `name`, `text`) VALUES ('2', 'Travel', 'Enjoy your travel');
INSERT INTO `hisabji_db`.`category` (`id`, `name`, `text`) VALUES ('3', 'Utilities', 'Basic utilities which needs to be taken care of');

-- Sub-category table data
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('1', 'Vegetables', '1');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('2', 'Dairy products', '1');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('3', 'Eggs & Meat', '1');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('4', 'Business trip', '2');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('5', 'Weekend getaway', '2');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('6', 'Family event', '2');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('7', 'House rent / EMI', '3');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('8', 'Telephone bill', '3');
INSERT INTO `hisabji_db`.`sub_categories` (`id`, `sub_category_name`, `category_id`) VALUES ('9', 'Electricity bill', '3');

-- Merchants table data
INSERT INTO `hisabji_db`.`merchants` (`id`, `active`, `merchant_name`, `category_id`) VALUES ('1', true, 'Amazon', '3');
INSERT INTO `hisabji_db`.`merchants` (`id`, `active`, `merchant_name`, `category_id`) VALUES ('2', true, 'Flipkart', '1');
INSERT INTO `hisabji_db`.`merchants` (`id`, `active`, `merchant_name`, `category_id`) VALUES ('3', true, 'MakeMyTrip','2');

-- Transaction table data
INSERT INTO `hisabji_db`.`transactions` (`id`, `account_from`, `account_to`, `amount`, `currency`, `description`,`last_updated_transaction`, `merchant`, `tags`,`transaction_time`, `category_id`) VALUES ('1', '111111', '222222', '10000.00', 'INR', 'Amazon order',CURRENT_TIMESTAMP, 'Amazon', 'test-tag',CURRENT_TIMESTAMP, '3');
INSERT INTO `hisabji_db`.`transactions` (`id`, `account_from`, `account_to`, `amount`, `currency`, `description`,`last_updated_transaction`, `merchant`, `tags`,`transaction_time`, `category_id`) VALUES ('2', '111111', '333333', '500.00', 'EUR', 'Euro trip tickets', CURRENT_TIMESTAMP,'MakeMyTrip', 'flight tickets',CURRENT_TIMESTAMP, '2');

