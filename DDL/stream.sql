CREATE TABLE `stream` (
  `stream_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用于区分每一个stream的标识',
  `stream_url` varchar(8200) COLLATE utf8_unicode_ci NOT NULL COMMENT 'stream的直播源链接',
  `stream_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL COMMENT '直播源名称',
  `stream_interduce` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '直播源简单介绍',
  `stream_fail` tinyint(4) NOT NULL COMMENT '表示直播源是否失效',
  `stream_crate` float DEFAULT NULL COMMENT '表示直播源的内容平均分',
  `stream_qrate` float DEFAULT NULL COMMENT '直播源流畅性评分',
  PRIMARY KEY (`stream_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci