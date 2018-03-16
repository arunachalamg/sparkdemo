package com.demo.batch.sparkdemo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Spark Batch Job demo
 *
 */
public class SparkDemoApp {
	
	private final static Logger logger = LoggerFactory.getLogger(SparkDemoApp.class);
	
    public static void main( String[] args ){
    	logger.warn("Test batch Job for Spark {}.."+ "Startued"); 
        SparkConf sc = new SparkConf().setAppName("TestDemo").setMaster("local[1]");
      
        JavaSparkContext con = new JavaSparkContext(sc);
		JavaRDD<String> rdd = con.textFile("C:\\demo\\sparkdemo\\src\\main\\resources\\testSpark");
		rdd.foreach(p->System.out.println(p));
    }
}
