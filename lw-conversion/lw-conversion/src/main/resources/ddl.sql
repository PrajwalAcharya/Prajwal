CREATE TABLE `conversionfact` (
  `id` int(11) NOT NULL,
  `CountryCode` varchar(45) DEFAULT NULL,
  `ConversionFactor` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB

INSERT INTO 'conversionfact' VALUES(101,'INR',75.2)