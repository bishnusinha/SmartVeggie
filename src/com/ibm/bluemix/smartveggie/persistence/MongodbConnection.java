package com.ibm.bluemix.smartveggie.persistence;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongodbConnection {

	private static MongoClient mongoClient = null;

	static String databaseHost = "getMongoDB";
	//static String databaseHost = "23.246.199.101";
	static String port = "27017";
	//static String port = "10039";
	static String databaseName = "smart_veggie";
	//static String databaseName = "db";
	static String username = "df74840c-015a-4113-9592-2765f16c5b0b";
	static String password = "6114ccaa-8671-4b05-86d2-14647dd6152e";
	static String databaseUrl = "mongodb://df74840c-015a-4113-9592-2765f16c5b0b:6114ccaa-8671-4b05-86d2-14647dd6152e@23.246.199.101:10039/db";
	//static String databaseUrl = "mongodb://IbmCloud_ep29clhq_ceicsk3c_rc19kjtl:gz7Dfvlyp2woBTWEHDthDRo20X1d3Hpm@ds041180.mongolab.com:41180/IbmCloud_ep29clhq_ceicsk3c";
	static String thekey = null;
	static boolean dbSetup = false;
	
	public static MongoClient getMongoClient() {
		return getMongoClientInstance();
	}

	public static DB getMongoDB() {
		DB dbName = null;
		try {
			MongoClient mongoClient = getMongoClientInstance();
			dbName = mongoClient.getDB(databaseName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dbName;
	}

	private static MongoClient getMongoClientInstance() {
		try {
			if (mongoClient == null) {
				mongoClient = new MongoClient("localhost", 27017);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mongoClient;
	}
	
/*public static DB getMongoDB() {
		
		DB db = null;
		try{
			MongoClient mongoClient;
			System.out.println("port" +port);
			mongoClient = new MongoClient(databaseHost, Integer.valueOf(port).intValue());
			db = mongoClient.getDB(databaseName);
			boolean auth = db.authenticate(username, password.toCharArray());
				if (!auth) {
					throw new Exception("Authorization Error");
				} else {
					System.out.println("Authenticated");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return db;
	}*/
}
