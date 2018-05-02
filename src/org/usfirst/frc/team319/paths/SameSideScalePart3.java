package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (22.92,21.75,-150.00)
	// (19.50,20.33,-160.00)
	
	public SameSideScalePart3() {
		this(false);
	}
			
    public SameSideScalePart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.124,2.485,10.000},
				{0.621,4.971,10.000},
				{1.740,11.185,10.000},
				{3.729,19.888,10.000},
				{6.837,31.080,10.000},
				{11.314,44.769,10.000},
				{17.410,60.961,10.000},
				{25.252,78.421,10.000},
				{34.843,95.912,10.000},
				{46.187,113.442,10.000},
				{59.289,131.017,10.000},
				{74.153,148.644,10.000},
				{90.786,166.330,10.000},
				{109.194,184.080,10.000},
				{129.384,201.901,10.000},
				{151.364,219.799,10.000},
				{175.142,237.780,10.000},
				{200.727,255.850,10.000},
				{228.128,274.013,10.000},
				{257.356,292.274,10.000},
				{288.420,310.640,10.000},
				{321.331,329.113,10.000},
				{356.101,347.699,10.000},
				{392.741,366.401,10.000},
				{431.264,385.223,10.000},
				{471.680,404.169,10.000},
				{514.004,423.241,10.000},
				{558.249,442.441,10.000},
				{604.426,461.773,10.000},
				{652.550,481.238,10.000},
				{702.633,500.837,10.000},
				{754.690,520.571,10.000},
				{808.735,540.442,10.000},
				{864.780,560.449,10.000},
				{922.839,580.593,10.000},
				{982.926,600.873,10.000},
				{1045.055,621.287,10.000},
				{1109.238,641.834,10.000},
				{1175.490,662.513,10.000},
				{1243.822,683.321,10.000},
				{1314.247,704.255,10.000},
				{1386.778,725.312,10.000},
				{1461.427,746.488,10.000},
				{1538.205,767.779,10.000},
				{1617.123,789.181,10.000},
				{1698.192,810.687,10.000},
				{1781.421,832.293,10.000},
				{1866.820,853.991,10.000},
				{1954.398,875.777,10.000},
				{2044.162,897.641,10.000},
				{2136.120,919.577,10.000},
				{2230.278,941.577,10.000},
				{2326.641,963.632,10.000},
				{2425.214,985.732,10.000},
				{2526.001,1007.868,10.000},
				{2629.004,1030.030,10.000},
				{2734.225,1052.208,10.000},
				{2841.664,1074.390,10.000},
				{2951.320,1096.565,10.000},
				{3063.192,1118.721,10.000},
				{3177.277,1140.845,10.000},
				{3293.569,1162.926,10.000},
				{3412.064,1184.949,10.000},
				{3532.754,1206.901,10.000},
				{3655.631,1228.768,10.000},
				{3780.685,1250.536,10.000},
				{3907.904,1272.191,10.000},
				{4037.275,1293.718,10.000},
				{4168.786,1315.101,10.000},
				{4302.418,1336.327,10.000},
				{4438.156,1357.378,10.000},
				{4575.980,1378.242,10.000},
				{4715.870,1398.901,10.000},
				{4857.804,1419.341,10.000},
				{5001.759,1439.546,10.000},
				{5147.565,1458.063,10.000},
				{5294.910,1473.444,10.000},
				{5443.478,1485.680,10.000},
				{5592.955,1494.771,10.000},
				{5743.027,1500.721,10.000},
				{5893.381,1503.540,10.000},
				{6043.705,1503.243,10.000},
				{6193.833,1501.277,10.000},
				{6343.741,1499.085,10.000},
				{6493.409,1496.675,10.000},
				{6642.814,1494.055,10.000},
				{6791.938,1491.234,10.000},
				{6940.760,1488.219,10.000},
				{7089.262,1485.019,10.000},
				{7237.426,1481.643,10.000},
				{7385.236,1478.098,10.000},
				{7532.675,1474.394,10.000},
				{7679.729,1470.538,10.000},
				{7826.383,1466.539,10.000},
				{7972.623,1462.405,10.000},
				{8118.438,1458.145,10.000},
				{8263.814,1453.768,10.000},
				{8408.743,1449.281,10.000},
				{8553.212,1444.693,10.000},
				{8697.213,1440.013,10.000},
				{8840.738,1435.247,10.000},
				{8983.778,1430.406,10.000},
				{9126.328,1425.496,10.000},
				{9268.381,1420.526,10.000},
				{9409.931,1415.504,10.000},
				{9550.975,1410.437,10.000},
				{9691.508,1405.335,10.000},
				{9831.529,1400.204,10.000},
				{9971.034,1395.053,10.000},
				{10110.023,1389.889,10.000},
				{10248.495,1384.719,10.000},
				{10386.450,1379.553,10.000},
				{10523.890,1374.396,10.000},
				{10660.815,1369.258,10.000},
				{10797.230,1364.144,10.000},
				{10933.136,1359.064,10.000},
				{11068.538,1354.024,10.000},
				{11203.442,1349.031,10.000},
				{11337.851,1344.094,10.000},
				{11471.773,1339.220,10.000},
				{11605.215,1334.416,10.000},
				{11738.183,1329.689,10.000},
				{11870.688,1325.047,10.000},
				{12002.684,1319.958,10.000},
				{12134.003,1313.186,10.000},
				{12264.407,1304.049,10.000},
				{12393.666,1292.585,10.000},
				{12521.549,1278.829,10.000},
				{12647.830,1262.812,10.000},
				{12772.286,1244.562,10.000},
				{12894.750,1224.633,10.000},
				{13015.176,1204.266,10.000},
				{13133.592,1184.157,10.000},
				{13250.022,1164.302,10.000},
				{13364.491,1144.690,10.000},
				{13477.023,1125.316,10.000},
				{13587.640,1106.169,10.000},
				{13696.364,1087.242,10.000},
				{13803.216,1068.526,10.000},
				{13908.218,1050.012,10.000},
				{14011.387,1031.691,10.000},
				{14112.742,1013.554,10.000},
				{14212.301,995.590,10.000},
				{14310.080,977.792,10.000},
				{14406.095,960.150,10.000},
				{14500.361,942.654,10.000},
				{14592.890,925.294,10.000},
				{14683.696,908.063,10.000},
				{14772.791,890.950,10.000},
				{14860.186,873.947,10.000},
				{14945.891,857.045,10.000},
				{15029.914,840.234,10.000},
				{15112.265,823.507,10.000},
				{15192.950,806.854,10.000},
				{15271.977,790.269,10.000},
				{15349.351,773.742,10.000},
				{15425.078,757.266,10.000},
				{15499.161,740.834,10.000},
				{15571.605,724.438,10.000},
				{15642.412,708.071,10.000},
				{15711.585,691.727,10.000},
				{15779.125,675.400,10.000},
				{15845.033,659.083,10.000},
				{15909.310,642.770,10.000},
				{15971.956,626.457,10.000},
				{16032.969,610.138,10.000},
				{16092.350,593.808,10.000},
				{16150.097,577.463,10.000},
				{16206.207,561.099,10.000},
				{16260.678,544.712,10.000},
				{16313.507,528.298,10.000},
				{16364.693,511.854,10.000},
				{16414.231,495.378,10.000},
				{16462.117,478.867,10.000},
				{16508.349,462.319,10.000},
				{16552.923,445.732,10.000},
				{16595.833,429.105,10.000},
				{16637.077,412.435,10.000},
				{16676.649,395.723,10.000},
				{16714.546,378.968,10.000},
				{16750.763,362.169,10.000},
				{16785.295,345.327,10.000},
				{16818.139,328.441,10.000},
				{16849.291,311.512,10.000},
				{16878.745,294.540,10.000},
				{16906.497,277.527,10.000},
				{16932.545,260.475,10.000},
				{16956.883,243.383,10.000},
				{16979.508,226.254,10.000},
				{17000.417,209.090,10.000},
				{17019.607,191.892,10.000},
				{17037.073,174.663,10.000},
				{17052.814,157.406,10.000},
				{17066.826,140.121,10.000},
				{17079.107,122.813,10.000},
				{17089.656,105.484,10.000},
				{17098.469,88.137,10.000},
				{17105.547,70.773,10.000},
				{17110.940,53.931,10.000},
				{17114.825,38.856,10.000},
				{17117.451,26.260,10.000},
				{17119.066,16.146,10.000},
				{17119.917,8.515,10.000},
				{17120.254,3.370,10.000},
				{17120.325,0.709,10.000},
				{17120.325,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.124,2.485,10.000},
				{0.621,4.971,10.000},
				{1.740,11.183,10.000},
				{3.728,19.879,10.000},
				{6.833,31.055,10.000},
				{11.304,44.706,10.000},
				{17.386,60.824,10.000},
				{25.202,78.160,10.000},
				{34.749,95.465,10.000},
				{46.022,112.730,10.000},
				{59.017,129.951,10.000},
				{73.729,147.120,10.000},
				{90.152,164.230,10.000},
				{108.279,181.275,10.000},
				{128.104,198.250,10.000},
				{149.619,215.147,10.000},
				{172.815,231.962,10.000},
				{197.684,248.689,10.000},
				{224.216,265.321,10.000},
				{252.402,281.855,10.000},
				{282.230,298.286,10.000},
				{313.691,314.608,10.000},
				{346.773,330.818,10.000},
				{381.464,346.912,10.000},
				{417.753,362.885,10.000},
				{455.626,378.735,10.000},
				{495.072,394.459,10.000},
				{536.077,410.054,10.000},
				{578.629,425.518,10.000},
				{622.714,440.850,10.000},
				{668.319,456.046,10.000},
				{715.430,471.107,10.000},
				{764.033,486.032,10.000},
				{814.115,500.821,10.000},
				{865.662,515.473,10.000},
				{918.661,529.989,10.000},
				{973.098,544.371,10.000},
				{1028.960,558.619,10.000},
				{1086.234,572.736,10.000},
				{1144.906,586.724,10.000},
				{1204.965,600.585,10.000},
				{1266.397,614.324,10.000},
				{1329.191,627.944,10.000},
				{1393.336,641.448,10.000},
				{1458.820,654.843,10.000},
				{1525.634,668.132,10.000},
				{1593.766,681.322,10.000},
				{1663.208,694.419,10.000},
				{1733.951,707.429,10.000},
				{1805.987,720.361,10.000},
				{1879.309,733.220,10.000},
				{1953.910,746.016,10.000},
				{2029.786,758.757,10.000},
				{2106.931,771.453,10.000},
				{2185.343,784.112,10.000},
				{2265.017,796.746,10.000},
				{2345.953,809.364,10.000},
				{2428.151,821.977,10.000},
				{2511.611,834.598,10.000},
				{2596.335,847.238,10.000},
				{2682.326,859.909,10.000},
				{2769.588,872.625,10.000},
				{2858.128,885.398,10.000},
				{2947.952,898.241,10.000},
				{3039.069,911.170,10.000},
				{3131.489,924.197,10.000},
				{3225.223,937.338,10.000},
				{3320.283,950.607,10.000},
				{3416.685,964.019,10.000},
				{3514.444,977.589,10.000},
				{3613.577,991.333,10.000},
				{3714.104,1005.266,10.000},
				{3816.044,1019.402,10.000},
				{3919.420,1033.758,10.000},
				{4024.255,1048.349,10.000},
				{4130.469,1062.141,10.000},
				{4237.879,1074.101,10.000},
				{4346.302,1084.233,10.000},
				{4455.556,1092.540,10.000},
				{4565.458,1099.016,10.000},
				{4675.823,1103.654,10.000},
				{4786.467,1106.437,10.000},
				{4897.307,1108.403,10.000},
				{5008.367,1110.594,10.000},
				{5119.667,1113.004,10.000},
				{5231.230,1115.624,10.000},
				{5343.074,1118.446,10.000},
				{5455.220,1121.460,10.000},
				{5567.686,1124.660,10.000},
				{5680.490,1128.037,10.000},
				{5793.648,1131.582,10.000},
				{5907.177,1135.286,10.000},
				{6021.091,1139.142,10.000},
				{6135.405,1143.141,10.000},
				{6250.132,1147.275,10.000},
				{6365.286,1151.535,10.000},
				{6480.877,1155.912,10.000},
				{6596.917,1160.399,10.000},
				{6713.416,1164.987,10.000},
				{6830.382,1169.668,10.000},
				{6947.826,1174.433,10.000},
				{7065.753,1179.274,10.000},
				{7184.172,1184.184,10.000},
				{7303.087,1189.154,10.000},
				{7422.505,1194.177,10.000},
				{7542.429,1199.243,10.000},
				{7662.863,1204.345,10.000},
				{7783.811,1209.476,10.000},
				{7905.274,1214.628,10.000},
				{8027.253,1219.792,10.000},
				{8149.749,1224.961,10.000},
				{8272.762,1230.128,10.000},
				{8396.290,1235.284,10.000},
				{8520.333,1240.423,10.000},
				{8644.886,1245.536,10.000},
				{8769.948,1250.617,10.000},
				{8895.514,1255.657,10.000},
				{9021.579,1260.649,10.000},
				{9148.137,1265.586,10.000},
				{9275.183,1270.461,10.000},
				{9402.710,1275.265,10.000},
				{9530.709,1279.992,10.000},
				{9659.172,1284.634,10.000},
				{9788.038,1288.655,10.000},
				{9917.119,1290.807,10.000},
				{10046.154,1290.353,10.000},
				{10174.879,1287.255,10.000},
				{10303.027,1281.478,10.000},
				{10430.326,1272.991,10.000},
				{10556.503,1261.766,10.000},
				{10681.335,1248.317,10.000},
				{10804.723,1233.889,10.000},
				{10926.644,1219.202,10.000},
				{11047.070,1204.262,10.000},
				{11165.977,1189.077,10.000},
				{11283.343,1173.656,10.000},
				{11399.144,1158.007,10.000},
				{11513.358,1142.138,10.000},
				{11625.963,1126.058,10.000},
				{11736.941,1109.776,10.000},
				{11846.271,1093.302,10.000},
				{11953.936,1076.644,10.000},
				{12059.917,1059.811,10.000},
				{12164.198,1042.814,10.000},
				{12266.764,1025.660,10.000},
				{12367.600,1008.361,10.000},
				{12466.693,990.924,10.000},
				{12564.029,973.360,10.000},
				{12659.596,955.677,10.000},
				{12753.385,937.884,10.000},
				{12845.384,919.991,10.000},
				{12935.584,902.006,10.000},
				{13023.978,883.938,10.000},
				{13110.558,865.794,10.000},
				{13195.316,847.584,10.000},
				{13278.248,829.315,10.000},
				{13359.347,810.995,10.000},
				{13438.610,792.632,10.000},
				{13516.033,774.232,10.000},
				{13591.614,755.803,10.000},
				{13665.349,737.351,10.000},
				{13737.237,718.883,10.000},
				{13807.277,700.404,10.000},
				{13875.470,681.921,10.000},
				{13941.813,663.438,10.000},
				{14006.309,644.961,10.000},
				{14068.959,626.495,10.000},
				{14129.764,608.045,10.000},
				{14188.725,589.613,10.000},
				{14245.845,571.205,10.000},
				{14301.128,552.823,10.000},
				{14354.575,534.471,10.000},
				{14406.190,516.151,10.000},
				{14455.976,497.866,10.000},
				{14503.938,479.619,10.000},
				{14550.079,461.410,10.000},
				{14594.403,443.242,10.000},
				{14636.915,425.115,10.000},
				{14677.618,407.032,10.000},
				{14716.517,388.991,10.000},
				{14753.617,370.994,10.000},
				{14788.921,353.041,10.000},
				{14822.434,335.131,10.000},
				{14854.160,317.265,10.000},
				{14884.104,299.440,10.000},
				{14912.270,281.657,10.000},
				{14938.661,263.914,10.000},
				{14963.283,246.210,10.000},
				{14986.137,228.543,10.000},
				{15007.228,210.912,10.000},
				{15026.559,193.314,10.000},
				{15044.134,175.747,10.000},
				{15059.955,158.209,10.000},
				{15074.025,140.697,10.000},
				{15086.346,123.210,10.000},
				{15096.920,105.743,10.000},
				{15105.749,88.295,10.000},
				{15112.836,70.862,10.000},
				{15118.233,53.976,10.000},
				{15122.121,38.876,10.000},
				{15124.748,26.268,10.000},
				{15126.362,16.148,10.000},
				{15127.214,8.516,10.000},
				{15127.551,3.370,10.000},
				{15127.622,0.709,10.000},
				{15127.622,0.000,10.000}
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