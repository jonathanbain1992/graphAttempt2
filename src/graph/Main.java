/**
 * 
 */
package graph;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

/**
 * @author jonathanbain
 *
 */
public class Main extends Application {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//Application.launch(args);
		new Main().start(null);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
				//Graph g = new Graph();
		
		
		ObservableList<XYChart.Data<Long, Long>> list = FXCollections.observableArrayList();
		
//		graphGUI gui = new graphGUI(2000, Integer.MAX_VALUE, list, primaryStage);
				
				
			//	Scanner sc = new Scanner(System.in);
			//	 System.out.println("Enter a number of nodes to make");
			//	 int input = sc.nextInt();
				
				for(long i=0; i<2048; i++) {
					long start = System.nanoTime();
					Graph g = new Graph();
					g.populateGraph((int) i);
					long time = System.nanoTime() - start;
					System.out.println(time + "ns");
					list.add(new XYChart.Data<Long, Long>(time, i));
				}
				System.out.println("Finished Data Collection");
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("test.csv"));
				list.forEach(data -> {
					try {
						writer.write("" + data.getXValue() + "," + data.getYValue() + '\n');
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				writer.close();
				//primaryStage.close();
				 
				 /*for(int[] i : g.matrixRepresentation) {
					 System.out.println(Arrays.toString(i));
				 }*/
	}

}
