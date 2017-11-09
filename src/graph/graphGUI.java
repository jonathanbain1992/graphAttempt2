package graph;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class graphGUI {
	int numNodes;
	int timeTaken;
	public ScatterChart<Long, Long> chart;
	public graphGUI(int numNodesX, int executionTime, ObservableList<XYChart.Data<Long, Long>> list, Stage stage){
		
		ObservableList<XYChart.Series<Long,Long >> data = FXCollections.observableArrayList();
		data.add(new XYChart.Series<Long, Long>(list));
		
		 NumberAxis numAx = new NumberAxis("Time Taken",0, executionTime,
	                10000000);
		 NumberAxis calcAx = new NumberAxis("Number of Nodes",0, numNodesX,
	             1);
	/*Create a non-auto-ranging NumberAxis with the given upper bound, lower bound and tick unit
	Parameters:
	axisLabel - The name to display for this axis
	lowerBound - The lower bound for this axis, ie min plottable value
	upperBound - The upper bound for this axis, ie max plottable value
	tickUnit - The tick unit, ie space between tickmarks
	*/		
			
			this.numNodes = numNodesX;
			this.timeTaken = timeTaken;
			this.chart= new ScatterChart(numAx,calcAx, data);
			this.chart.setPrefSize(700, 500);
			//this.chart.minHeight(600);
			//this.chart.minWidth(800);
		
		Scene scene = new Scene(new Group(new Text("Test")), 800, 600);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.setTitle("Graph Plotter");
		stage.show();
		
		
		
	}
	


}
