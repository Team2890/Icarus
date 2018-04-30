package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart5 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (19.50,20.33,0.00)
	// (22.92,20.33,0.00)
	
	public SameSideScalePart5() {
		this(false);
	}
			
    public SameSideScalePart5(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.015,0.291,10.000},
				{0.073,0.583,10.000},
				{0.204,1.311,10.000},
				{0.437,2.330,10.000},
				{0.801,3.641,10.000},
				{1.325,5.243,10.000},
				{2.039,7.136,10.000},
				{2.956,9.175,10.000},
				{4.078,11.213,10.000},
				{5.403,13.252,10.000},
				{6.932,15.291,10.000},
				{8.665,17.330,10.000},
				{10.602,19.369,10.000},
				{12.743,21.408,10.000},
				{15.087,23.446,10.000},
				{17.636,25.485,10.000},
				{20.388,27.524,10.000},
				{23.344,29.563,10.000},
				{26.505,31.602,10.000},
				{29.869,33.640,10.000},
				{33.437,35.679,10.000},
				{37.208,37.718,10.000},
				{41.184,39.757,10.000},
				{45.364,41.796,10.000},
				{49.747,43.834,10.000},
				{54.334,45.873,10.000},
				{59.126,47.912,10.000},
				{64.121,49.951,10.000},
				{69.320,51.990,10.000},
				{74.722,54.029,10.000},
				{80.329,56.067,10.000},
				{86.140,58.106,10.000},
				{92.154,60.145,10.000},
				{98.373,62.184,10.000},
				{104.795,64.223,10.000},
				{111.421,66.261,10.000},
				{118.251,68.300,10.000},
				{125.285,70.339,10.000},
				{132.523,72.378,10.000},
				{139.965,74.417,10.000},
				{147.610,76.455,10.000},
				{155.459,78.494,10.000},
				{163.513,80.533,10.000},
				{171.770,82.572,10.000},
				{180.231,84.611,10.000},
				{188.896,86.650,10.000},
				{197.765,88.688,10.000},
				{206.838,90.727,10.000},
				{216.114,92.766,10.000},
				{225.595,94.805,10.000},
				{235.279,96.844,10.000},
				{245.167,98.882,10.000},
				{255.259,100.921,10.000},
				{265.555,102.960,10.000},
				{276.055,104.999,10.000},
				{286.759,107.038,10.000},
				{297.667,109.076,10.000},
				{308.778,111.115,10.000},
				{320.094,113.154,10.000},
				{331.613,115.193,10.000},
				{343.336,117.232,10.000},
				{355.263,119.271,10.000},
				{367.394,121.309,10.000},
				{379.729,123.348,10.000},
				{392.268,125.387,10.000},
				{405.010,127.426,10.000},
				{417.957,129.465,10.000},
				{431.107,131.503,10.000},
				{444.461,133.542,10.000},
				{458.019,135.581,10.000},
				{471.781,137.620,10.000},
				{485.747,139.659,10.000},
				{499.917,141.698,10.000},
				{514.291,143.736,10.000},
				{528.868,145.775,10.000},
				{543.635,147.668,10.000},
				{558.562,149.270,10.000},
				{573.620,150.581,10.000},
				{588.780,151.600,10.000},
				{604.013,152.328,10.000},
				{619.289,152.765,10.000},
				{634.581,152.911,10.000},
				{649.872,152.911,10.000},
				{665.163,152.911,10.000},
				{680.454,152.911,10.000},
				{695.745,152.911,10.000},
				{711.036,152.911,10.000},
				{726.327,152.911,10.000},
				{741.618,152.911,10.000},
				{756.909,152.911,10.000},
				{772.200,152.911,10.000},
				{787.492,152.911,10.000},
				{802.783,152.911,10.000},
				{818.074,152.911,10.000},
				{833.365,152.911,10.000},
				{848.656,152.911,10.000},
				{863.947,152.911,10.000},
				{879.238,152.911,10.000},
				{894.529,152.911,10.000},
				{909.820,152.911,10.000},
				{925.111,152.911,10.000},
				{940.403,152.911,10.000},
				{955.694,152.911,10.000},
				{970.985,152.911,10.000},
				{986.276,152.911,10.000},
				{1001.567,152.911,10.000},
				{1016.858,152.911,10.000},
				{1032.149,152.911,10.000},
				{1047.440,152.911,10.000},
				{1062.731,152.911,10.000},
				{1078.022,152.911,10.000},
				{1093.313,152.911,10.000},
				{1108.605,152.911,10.000},
				{1123.894,152.895,10.000},
				{1139.166,152.717,10.000},
				{1154.390,152.248,10.000},
				{1169.539,151.487,10.000},
				{1184.583,150.435,10.000},
				{1199.492,149.092,10.000},
				{1214.238,147.458,10.000},
				{1228.793,145.549,10.000},
				{1243.144,143.510,10.000},
				{1257.291,141.471,10.000},
				{1271.234,139.432,10.000},
				{1284.973,137.393,10.000},
				{1298.509,135.355,10.000},
				{1311.840,133.316,10.000},
				{1324.968,131.277,10.000},
				{1337.892,129.238,10.000},
				{1350.612,127.199,10.000},
				{1363.128,125.160,10.000},
				{1375.440,123.122,10.000},
				{1387.548,121.083,10.000},
				{1399.453,119.044,10.000},
				{1411.153,117.005,10.000},
				{1422.650,114.966,10.000},
				{1433.943,112.928,10.000},
				{1445.031,110.889,10.000},
				{1455.916,108.850,10.000},
				{1466.597,106.811,10.000},
				{1477.075,104.772,10.000},
				{1487.348,102.734,10.000},
				{1497.418,100.695,10.000},
				{1507.283,98.656,10.000},
				{1516.945,96.617,10.000},
				{1526.403,94.578,10.000},
				{1535.657,92.539,10.000},
				{1544.707,90.501,10.000},
				{1553.553,88.462,10.000},
				{1562.195,86.423,10.000},
				{1570.634,84.384,10.000},
				{1578.868,82.345,10.000},
				{1586.899,80.307,10.000},
				{1594.726,78.268,10.000},
				{1602.348,76.229,10.000},
				{1609.767,74.190,10.000},
				{1616.983,72.151,10.000},
				{1623.994,70.113,10.000},
				{1630.801,68.074,10.000},
				{1637.405,66.035,10.000},
				{1643.804,63.996,10.000},
				{1650.000,61.957,10.000},
				{1655.992,59.918,10.000},
				{1661.780,57.880,10.000},
				{1667.364,55.841,10.000},
				{1672.744,53.802,10.000},
				{1677.920,51.763,10.000},
				{1682.893,49.724,10.000},
				{1687.661,47.686,10.000},
				{1692.226,45.647,10.000},
				{1696.587,43.608,10.000},
				{1700.744,41.569,10.000},
				{1704.697,39.530,10.000},
				{1708.446,37.492,10.000},
				{1711.991,35.453,10.000},
				{1715.333,33.414,10.000},
				{1718.470,31.375,10.000},
				{1721.404,29.336,10.000},
				{1724.134,27.297,10.000},
				{1726.659,25.259,10.000},
				{1728.981,23.220,10.000},
				{1731.100,21.181,10.000},
				{1733.014,19.142,10.000},
				{1734.724,17.103,10.000},
				{1736.231,15.065,10.000},
				{1737.533,13.026,10.000},
				{1738.632,10.987,10.000},
				{1739.527,8.948,10.000},
				{1740.219,6.925,10.000},
				{1740.726,5.065,10.000},
				{1741.075,3.495,10.000},
				{1741.297,2.217,10.000},
				{1741.420,1.230,10.000},
				{1741.473,0.534,10.000},
				{1741.486,0.129,10.000},
				{1741.486,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.015,0.291,10.000},
				{0.073,0.583,10.000},
				{0.204,1.311,10.000},
				{0.437,2.330,10.000},
				{0.801,3.641,10.000},
				{1.325,5.243,10.000},
				{2.039,7.136,10.000},
				{2.956,9.175,10.000},
				{4.078,11.213,10.000},
				{5.403,13.252,10.000},
				{6.932,15.291,10.000},
				{8.665,17.330,10.000},
				{10.602,19.369,10.000},
				{12.743,21.408,10.000},
				{15.087,23.446,10.000},
				{17.636,25.485,10.000},
				{20.388,27.524,10.000},
				{23.344,29.563,10.000},
				{26.505,31.602,10.000},
				{29.869,33.640,10.000},
				{33.437,35.679,10.000},
				{37.208,37.718,10.000},
				{41.184,39.757,10.000},
				{45.364,41.796,10.000},
				{49.747,43.834,10.000},
				{54.334,45.873,10.000},
				{59.126,47.912,10.000},
				{64.121,49.951,10.000},
				{69.320,51.990,10.000},
				{74.722,54.029,10.000},
				{80.329,56.067,10.000},
				{86.140,58.106,10.000},
				{92.154,60.145,10.000},
				{98.373,62.184,10.000},
				{104.795,64.223,10.000},
				{111.421,66.261,10.000},
				{118.251,68.300,10.000},
				{125.285,70.339,10.000},
				{132.523,72.378,10.000},
				{139.965,74.417,10.000},
				{147.610,76.455,10.000},
				{155.459,78.494,10.000},
				{163.513,80.533,10.000},
				{171.770,82.572,10.000},
				{180.231,84.611,10.000},
				{188.896,86.650,10.000},
				{197.765,88.688,10.000},
				{206.838,90.727,10.000},
				{216.114,92.766,10.000},
				{225.595,94.805,10.000},
				{235.279,96.844,10.000},
				{245.167,98.882,10.000},
				{255.259,100.921,10.000},
				{265.555,102.960,10.000},
				{276.055,104.999,10.000},
				{286.759,107.038,10.000},
				{297.667,109.076,10.000},
				{308.778,111.115,10.000},
				{320.094,113.154,10.000},
				{331.613,115.193,10.000},
				{343.336,117.232,10.000},
				{355.263,119.271,10.000},
				{367.394,121.309,10.000},
				{379.729,123.348,10.000},
				{392.268,125.387,10.000},
				{405.010,127.426,10.000},
				{417.957,129.465,10.000},
				{431.107,131.503,10.000},
				{444.461,133.542,10.000},
				{458.019,135.581,10.000},
				{471.781,137.620,10.000},
				{485.747,139.659,10.000},
				{499.917,141.698,10.000},
				{514.291,143.736,10.000},
				{528.868,145.775,10.000},
				{543.635,147.668,10.000},
				{558.562,149.270,10.000},
				{573.620,150.581,10.000},
				{588.780,151.600,10.000},
				{604.013,152.328,10.000},
				{619.289,152.765,10.000},
				{634.581,152.911,10.000},
				{649.872,152.911,10.000},
				{665.163,152.911,10.000},
				{680.454,152.911,10.000},
				{695.745,152.911,10.000},
				{711.036,152.911,10.000},
				{726.327,152.911,10.000},
				{741.618,152.911,10.000},
				{756.909,152.911,10.000},
				{772.200,152.911,10.000},
				{787.492,152.911,10.000},
				{802.783,152.911,10.000},
				{818.074,152.911,10.000},
				{833.365,152.911,10.000},
				{848.656,152.911,10.000},
				{863.947,152.911,10.000},
				{879.238,152.911,10.000},
				{894.529,152.911,10.000},
				{909.820,152.911,10.000},
				{925.111,152.911,10.000},
				{940.403,152.911,10.000},
				{955.694,152.911,10.000},
				{970.985,152.911,10.000},
				{986.276,152.911,10.000},
				{1001.567,152.911,10.000},
				{1016.858,152.911,10.000},
				{1032.149,152.911,10.000},
				{1047.440,152.911,10.000},
				{1062.731,152.911,10.000},
				{1078.022,152.911,10.000},
				{1093.313,152.911,10.000},
				{1108.605,152.911,10.000},
				{1123.894,152.895,10.000},
				{1139.166,152.717,10.000},
				{1154.390,152.248,10.000},
				{1169.539,151.487,10.000},
				{1184.583,150.435,10.000},
				{1199.492,149.092,10.000},
				{1214.238,147.458,10.000},
				{1228.793,145.549,10.000},
				{1243.144,143.510,10.000},
				{1257.291,141.471,10.000},
				{1271.234,139.432,10.000},
				{1284.973,137.393,10.000},
				{1298.509,135.355,10.000},
				{1311.840,133.316,10.000},
				{1324.968,131.277,10.000},
				{1337.892,129.238,10.000},
				{1350.612,127.199,10.000},
				{1363.128,125.160,10.000},
				{1375.440,123.122,10.000},
				{1387.548,121.083,10.000},
				{1399.453,119.044,10.000},
				{1411.153,117.005,10.000},
				{1422.650,114.966,10.000},
				{1433.943,112.928,10.000},
				{1445.031,110.889,10.000},
				{1455.916,108.850,10.000},
				{1466.597,106.811,10.000},
				{1477.075,104.772,10.000},
				{1487.348,102.734,10.000},
				{1497.418,100.695,10.000},
				{1507.283,98.656,10.000},
				{1516.945,96.617,10.000},
				{1526.403,94.578,10.000},
				{1535.657,92.539,10.000},
				{1544.707,90.501,10.000},
				{1553.553,88.462,10.000},
				{1562.195,86.423,10.000},
				{1570.634,84.384,10.000},
				{1578.868,82.345,10.000},
				{1586.899,80.307,10.000},
				{1594.726,78.268,10.000},
				{1602.348,76.229,10.000},
				{1609.767,74.190,10.000},
				{1616.983,72.151,10.000},
				{1623.994,70.113,10.000},
				{1630.801,68.074,10.000},
				{1637.405,66.035,10.000},
				{1643.804,63.996,10.000},
				{1650.000,61.957,10.000},
				{1655.992,59.918,10.000},
				{1661.780,57.880,10.000},
				{1667.364,55.841,10.000},
				{1672.744,53.802,10.000},
				{1677.920,51.763,10.000},
				{1682.893,49.724,10.000},
				{1687.661,47.686,10.000},
				{1692.226,45.647,10.000},
				{1696.587,43.608,10.000},
				{1700.744,41.569,10.000},
				{1704.697,39.530,10.000},
				{1708.446,37.492,10.000},
				{1711.991,35.453,10.000},
				{1715.333,33.414,10.000},
				{1718.470,31.375,10.000},
				{1721.404,29.336,10.000},
				{1724.134,27.297,10.000},
				{1726.659,25.259,10.000},
				{1728.981,23.220,10.000},
				{1731.100,21.181,10.000},
				{1733.014,19.142,10.000},
				{1734.724,17.103,10.000},
				{1736.231,15.065,10.000},
				{1737.533,13.026,10.000},
				{1738.632,10.987,10.000},
				{1739.527,8.948,10.000},
				{1740.219,6.925,10.000},
				{1740.726,5.065,10.000},
				{1741.075,3.495,10.000},
				{1741.297,2.217,10.000},
				{1741.420,1.230,10.000},
				{1741.473,0.534,10.000},
				{1741.486,0.129,10.000},
				{1741.486,0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}