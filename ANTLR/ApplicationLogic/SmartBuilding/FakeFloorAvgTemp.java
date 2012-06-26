package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.FloorAvgTemp;
import framework.TempStruct;

public class FakeFloorAvgTemp extends FloorAvgTemp {

	final List<Double> temps = Collections
			.synchronizedList(new ArrayList<Double>());
	private double currentAverage;
	private int numSample = 0;
	private final int NUM_SAMPLE_FOR_AVG = 2;

	public FakeFloorAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewroomAvgTempMeasurement(TempStruct arg) {

		synchronized (this.temps) {

			numSample = numSample + 1;
			if (numSample <= NUM_SAMPLE_FOR_AVG) {

				temps.add(arg.gettempValue());
				currentAverage = 0;

				for (Double temp : temps) {
					currentAverage += temp;
				}

				currentAverage /= temps.size();

			}

			if (numSample == NUM_SAMPLE_FOR_AVG) {
				numSample = 0;
				TempStruct avgTemp = new TempStruct(currentAverage,
						arg.getunitOfMeasurement());
				setfloorAvgTempMeasurement(avgTemp);
			}
		}

	}

}