package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (14.33,21.50,-90.00)
	// (17.50,23.83,-179.00)
	// (21.25,24.25,-135.00)
	
	public SameSideSwitchPart3() {
		this(false);
	}
			
    public SameSideSwitchPart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.130,-2.604,10.000},
				{-0.651,-5.209,10.000},
				{-1.823,-11.719,10.000},
				{-3.906,-20.831,10.000},
				{-7.160,-32.542,10.000},
				{-11.715,-45.545,10.000},
				{-17.568,-58.535,10.000},
				{-24.719,-71.507,10.000},
				{-33.165,-84.457,10.000},
				{-42.903,-97.383,10.000},
				{-53.931,-110.279,10.000},
				{-66.245,-123.143,10.000},
				{-79.842,-135.970,10.000},
				{-94.718,-148.756,10.000},
				{-110.868,-161.499,10.000},
				{-128.287,-174.194,10.000},
				{-146.971,-186.837,10.000},
				{-166.913,-199.426,10.000},
				{-188.109,-211.956,10.000},
				{-210.551,-224.425,10.000},
				{-234.234,-236.827,10.000},
				{-259.150,-249.161,10.000},
				{-285.293,-261.423,10.000},
				{-312.653,-273.609,10.000},
				{-341.225,-285.715,10.000},
				{-370.999,-297.740,10.000},
				{-401.967,-309.678,10.000},
				{-434.119,-321.527,10.000},
				{-467.448,-333.284,10.000},
				{-501.942,-344.945,10.000},
				{-537.593,-356.506,10.000},
				{-574.389,-367.965,10.000},
				{-612.321,-379.319,10.000},
				{-651.378,-390.562,10.000},
				{-691.547,-401.693,10.000},
				{-732.818,-412.708,10.000},
				{-775.178,-423.602,10.000},
				{-818.615,-434.373,10.000},
				{-863.117,-445.016,10.000},
				{-908.670,-455.528,10.000},
				{-955.260,-465.904,10.000},
				{-1002.874,-476.141,10.000},
				{-1051.497,-486.233,10.000},
				{-1101.115,-496.177,10.000},
				{-1151.712,-505.968,10.000},
				{-1203.272,-515.600,10.000},
				{-1255.779,-525.069,10.000},
				{-1309.216,-534.369,10.000},
				{-1363.565,-543.494,10.000},
				{-1418.809,-552.439,10.000},
				{-1474.929,-561.196,10.000},
				{-1531.905,-569.759,10.000},
				{-1589.717,-578.121,10.000},
				{-1648.344,-586.273,10.000},
				{-1707.765,-594.209,10.000},
				{-1767.957,-601.919,10.000},
				{-1828.896,-609.394,10.000},
				{-1890.559,-616.624,10.000},
				{-1952.918,-623.598,10.000},
				{-2015.949,-630.306,10.000},
				{-2079.623,-636.736,10.000},
				{-2143.910,-642.874,10.000},
				{-2208.781,-648.706,10.000},
				{-2274.203,-654.219,10.000},
				{-2340.142,-659.397,10.000},
				{-2406.565,-664.222,10.000},
				{-2473.432,-668.677,10.000},
				{-2540.706,-672.742,10.000},
				{-2608.346,-676.397,10.000},
				{-2676.308,-679.620,10.000},
				{-2744.547,-682.386,10.000},
				{-2813.014,-684.670,10.000},
				{-2881.658,-686.445,10.000},
				{-2950.427,-687.682,10.000},
				{-3019.261,-688.348,10.000},
				{-3088.102,-688.410,10.000},
				{-3156.886,-687.832,10.000},
				{-3225.543,-686.575,10.000},
				{-3294.003,-684.596,10.000},
				{-3362.188,-681.850,10.000},
				{-3430.017,-678.291,10.000},
				{-3497.403,-673.866,10.000},
				{-3564.255,-668.520,10.000},
				{-3630.475,-662.194,10.000},
				{-3695.957,-654.826,10.000},
				{-3760.592,-646.348,10.000},
				{-3824.261,-636.689,10.000},
				{-3886.839,-625.774,10.000},
				{-3948.191,-613.522,10.000},
				{-4008.176,-599.849,10.000},
				{-4066.642,-584.668,10.000},
				{-4123.431,-567.886,10.000},
				{-4178.372,-549.407,10.000},
				{-4231.285,-529.136,10.000},
				{-4281.982,-506.972,10.000},
				{-4330.264,-482.817,10.000},
				{-4375.922,-456.575,10.000},
				{-4418.737,-428.154,10.000},
				{-4458.484,-397.470,10.000},
				{-4494.929,-364.452,10.000},
				{-4527.834,-329.046,10.000},
				{-4556.956,-291.220,10.000},
				{-4582.053,-250.975,10.000},
				{-4602.888,-208.349,10.000},
				{-4619.231,-163.432,10.000},
				{-4630.869,-116.374,10.000},
				{-4637.609,-67.397,10.000},
				{-4639.290,-16.811,10.000},
				{-4642.787,-34.978,10.000},
				{-4651.532,-87.450,10.000},
				{-4665.530,-139.971,10.000},
				{-4684.708,-191.781,10.000},
				{-4708.908,-241.999,10.000},
				{-4737.871,-289.631,10.000},
				{-4771.230,-333.593,10.000},
				{-4808.504,-372.740,10.000},
				{-4849.095,-405.908,10.000},
				{-4892.292,-431.968,10.000},
				{-4937.280,-449.881,10.000},
				{-4983.156,-458.762,10.000},
				{-5028.949,-457.932,10.000},
				{-5073.646,-446.971,10.000},
				{-5116.220,-425.737,10.000},
				{-5155.658,-394.386,10.000},
				{-5190.994,-353.355,10.000},
				{-5221.327,-303.332,10.000},
				{-5245.848,-245.210,10.000},
				{-5263.851,-180.030,10.000},
				{-5274.743,-108.918,10.000},
				{-5278.046,-33.033,10.000},
				{-5282.695,-46.493,10.000},
				{-5295.554,-128.586,10.000},
				{-5316.781,-212.269,10.000},
				{-5346.449,-296.677,10.000},
				{-5384.555,-381.068,10.000},
				{-5431.038,-464.821,10.000},
				{-5485.781,-547.435,10.000},
				{-5548.633,-628.518,10.000},
				{-5619.410,-707.773,10.000},
				{-5697.909,-784.991,10.000},
				{-5783.912,-860.032,10.000},
				{-5877.194,-932.818,10.000},
				{-5977.526,-1003.317,10.000},
				{-6084.680,-1071.537,10.000},
				{-6198.431,-1137.513,10.000},
				{-6318.562,-1201.304,10.000},
				{-6444.860,-1262.984,10.000},
				{-6577.124,-1322.637,10.000},
				{-6715.159,-1380.354,10.000},
				{-6858.782,-1436.227,10.000},
				{-7007.817,-1490.349,10.000},
				{-7162.098,-1542.812,10.000},
				{-7321.468,-1593.700,10.000},
				{-7485.777,-1643.094,10.000},
				{-7654.884,-1691.068,10.000},
				{-7828.653,-1737.687,10.000},
				{-8006.953,-1783.005,10.000},
				{-8189.660,-1827.069,10.000},
				{-8376.652,-1869.914,10.000},
				{-8567.808,-1911.562,10.000},
				{-8763.010,-1952.023,10.000},
				{-8962.139,-1991.294,10.000},
				{-9165.075,-2029.357,10.000},
				{-9371.693,-2066.177,10.000},
				{-9581.863,-2101.704,10.000},
				{-9795.450,-2135.870,10.000},
				{-10012.309,-2168.586,10.000},
				{-10232.150,-2198.410,10.000},
				{-10454.533,-2223.833,10.000},
				{-10678.998,-2244.649,10.000},
				{-10905.063,-2260.655,10.000},
				{-11132.229,-2271.658,10.000},
				{-11360.113,-2278.842,10.000},
				{-11588.455,-2283.420,10.000},
				{-11816.980,-2285.242,10.000},
				{-12045.395,-2284.153,10.000},
				{-12273.394,-2279.993,10.000},
				{-12500.654,-2272.603,10.000},
				{-12726.704,-2260.493,10.000},
				{-12950.925,-2242.217,10.000},
				{-13172.700,-2217.743,10.000},
				{-13391.412,-2187.121,10.000},
				{-13606.231,-2148.192,10.000},
				{-13809.180,-2029.485,10.000},
				{-13997.740,-1885.604,10.000},
				{-14173.517,-1757.770,10.000},
				{-14338.045,-1645.282,10.000},
				{-14492.786,-1547.412,10.000},
				{-14639.128,-1463.419,10.000},
				{-14778.382,-1392.535,10.000},
				{-14911.779,-1333.971,10.000},
				{-15040.470,-1286.911,10.000},
				{-15165.521,-1250.511,10.000},
				{-15287.912,-1223.908,10.000},
				{-15408.534,-1206.225,10.000},
				{-15528.193,-1196.584,10.000},
				{-15647.604,-1194.116,10.000},
				{-15767.402,-1197.978,10.000},
				{-15888.138,-1207.360,10.000},
				{-16010.288,-1221.497,10.000},
				{-16134.256,-1239.679,10.000},
				{-16260.381,-1261.256,10.000},
				{-16388.945,-1285.641,10.000},
				{-16520.177,-1312.313,10.000},
				{-16654.258,-1340.813,10.000},
				{-16791.333,-1370.748,10.000},
				{-16931.511,-1401.779,10.000},
				{-17074.873,-1433.626,10.000},
				{-17221.479,-1466.055,10.000},
				{-17371.367,-1498.878,10.000},
				{-17524.561,-1531.947,10.000},
				{-17681.076,-1565.148,10.000},
				{-17840.915,-1598.394,10.000},
				{-18004.078,-1631.626,10.000},
				{-18170.558,-1664.804,10.000},
				{-18340.349,-1697.906,10.000},
				{-18513.441,-1730.920,10.000},
				{-18689.826,-1763.849,10.000},
				{-18869.496,-1796.697,10.000},
				{-19052.444,-1829.478,10.000},
				{-19238.664,-1862.203,10.000},
				{-19428.152,-1894.884,10.000},
				{-19620.905,-1927.530,10.000},
				{-19816.920,-1960.146,10.000},
				{-20016.192,-1992.727,10.000},
				{-20218.718,-2025.260,10.000},
				{-20424.490,-2057.721,10.000},
				{-20633.498,-2090.072,10.000},
				{-20845.724,-2122.261,10.000},
				{-21061.146,-2154.218,10.000},
				{-21279.731,-2185.856,10.000},
				{-21501.438,-2217.067,10.000},
				{-21726.210,-2247.725,10.000},
				{-21953.978,-2277.680,10.000},
				{-22184.655,-2306.763,10.000},
				{-22418.133,-2334.785,10.000},
				{-22654.287,-2361.538,10.000},
				{-22892.967,-2386.796,10.000},
				{-23133.999,-2410.321,10.000},
				{-23377.185,-2431.865,10.000},
				{-23622.303,-2451.176,10.000},
				{-23869.103,-2468.001,10.000},
				{-24117.312,-2482.096,10.000},
				{-24366.636,-2493.231,10.000},
				{-24616.755,-2501.198,10.000},
				{-24867.337,-2505.813,10.000},
				{-25118.030,-2506.931,10.000},
				{-25368.474,-2504.444,10.000},
				{-25618.303,-2498.286,10.000},
				{-25867.147,-2488.441,10.000},
				{-26114.641,-2474.938,10.000},
				{-26360.426,-2457.853,10.000},
				{-26604.157,-2437.308,10.000},
				{-26845.503,-2413.464,10.000},
				{-27084.155,-2386.521,10.000},
				{-27319.826,-2356.705,10.000},
				{-27552.253,-2324.269,10.000},
				{-27781.201,-2289.479,10.000},
				{-28006.462,-2252.614,10.000},
				{-28227.858,-2213.954,10.000},
				{-28445.235,-2173.778,10.000},
				{-28658.471,-2132.355,10.000},
				{-28867.465,-2089.944,10.000},
				{-29072.144,-2046.789,10.000},
				{-29272.456,-2003.116,10.000},
				{-29468.369,-1959.130,10.000},
				{-29659.870,-1915.017,10.000},
				{-29846.965,-1870.944,10.000},
				{-30029.671,-1827.057,10.000},
				{-30208.019,-1783.482,10.000},
				{-30382.051,-1740.326,10.000},
				{-30551.819,-1697.681,10.000},
				{-30717.382,-1655.622,10.000},
				{-30878.803,-1614.210,10.000},
				{-31036.152,-1573.493,10.000},
				{-31189.503,-1533.508,10.000},
				{-31338.931,-1494.282,10.000},
				{-31484.514,-1455.833,10.000},
				{-31626.331,-1418.172,10.000},
				{-31764.462,-1381.304,10.000},
				{-31898.984,-1345.226,10.000},
				{-32029.978,-1309.935,10.000},
				{-32157.520,-1275.421,10.000},
				{-32281.687,-1241.671,10.000},
				{-32402.554,-1208.673,10.000},
				{-32520.195,-1176.409,10.000},
				{-32634.682,-1144.862,10.000},
				{-32746.083,-1114.013,10.000},
				{-32854.467,-1083.845,10.000},
				{-32959.901,-1054.336,10.000},
				{-33062.448,-1025.467,10.000},
				{-33162.169,-997.219,10.000},
				{-33259.127,-969.572,10.000},
				{-33353.377,-942.508,10.000},
				{-33444.978,-916.007,10.000},
				{-33533.983,-890.051,10.000},
				{-33620.446,-864.623,10.000},
				{-33704.416,-839.706,10.000},
				{-33785.944,-815.283,10.000},
				{-33865.078,-791.339,10.000},
				{-33941.864,-767.857,10.000},
				{-34016.346,-744.825,10.000},
				{-34088.569,-722.227,10.000},
				{-34158.574,-700.050,10.000},
				{-34226.402,-678.282,10.000},
				{-34292.094,-656.911,10.000},
				{-34355.686,-635.924,10.000},
				{-34417.217,-615.310,10.000},
				{-34476.723,-595.058,10.000},
				{-34534.239,-575.159,10.000},
				{-34589.799,-555.602,10.000},
				{-34643.436,-536.377,10.000},
				{-34695.184,-517.476,10.000},
				{-34745.073,-498.888,10.000},
				{-34793.133,-480.606,10.000},
				{-34839.395,-462.620,10.000},
				{-34883.888,-444.923,10.000},
				{-34926.638,-427.506,10.000},
				{-34967.675,-410.361,10.000},
				{-35007.022,-393.479,10.000},
				{-35044.708,-376.854,10.000},
				{-35080.755,-360.476,10.000},
				{-35115.189,-344.338,10.000},
				{-35148.032,-328.431,10.000},
				{-35179.307,-312.749,10.000},
				{-35209.035,-297.282,10.000},
				{-35237.238,-282.023,10.000},
				{-35263.934,-266.963,10.000},
				{-35289.143,-252.093,10.000},
				{-35312.884,-237.406,10.000},
				{-35335.173,-222.893,10.000},
				{-35356.028,-208.545,10.000},
				{-35375.463,-194.352,10.000},
				{-35393.493,-180.306,10.000},
				{-35410.133,-166.397,10.000},
				{-35425.395,-152.617,10.000},
				{-35439.290,-138.955,10.000},
				{-35451.830,-125.402,10.000},
				{-35463.025,-111.947,10.000},
				{-35472.883,-98.582,10.000},
				{-35481.413,-85.295,10.000},
				{-35488.621,-72.077,10.000},
				{-35494.512,-58.917,10.000},
				{-35499.093,-45.805,10.000},
				{-35502.366,-32.730,10.000},
				{-35504.463,-20.971,10.000},
				{-35505.645,-11.818,10.000},
				{-35506.173,-5.277,10.000},
				{-35506.307,-1.343,10.000},
				{-35506.308,-0.014,10.000},
				{-35506.308,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.130,-2.604,10.000},
				{-0.651,-5.209,10.000},
				{-1.823,-11.721,10.000},
				{-3.907,-20.840,10.000},
				{-7.164,-32.570,10.000},
				{-11.725,-45.611,10.000},
				{-17.592,-58.666,10.000},
				{-24.766,-71.739,10.000},
				{-33.249,-84.833,10.000},
				{-43.045,-97.953,10.000},
				{-54.155,-111.101,10.000},
				{-66.583,-124.282,10.000},
				{-80.333,-137.500,10.000},
				{-95.409,-150.758,10.000},
				{-111.815,-164.060,10.000},
				{-129.556,-177.410,10.000},
				{-148.637,-190.811,10.000},
				{-169.064,-204.267,10.000},
				{-190.842,-217.782,10.000},
				{-213.977,-231.358,10.000},
				{-238.477,-245.000,10.000},
				{-264.349,-258.711,10.000},
				{-291.598,-272.494,10.000},
				{-320.233,-286.353,10.000},
				{-350.262,-300.291,10.000},
				{-381.693,-314.311,10.000},
				{-414.535,-328.418,10.000},
				{-448.796,-342.613,10.000},
				{-484.487,-356.901,10.000},
				{-521.615,-371.285,10.000},
				{-560.192,-385.768,10.000},
				{-600.227,-400.354,10.000},
				{-641.732,-415.045,10.000},
				{-684.716,-429.846,10.000},
				{-729.192,-444.760,10.000},
				{-775.171,-459.790,10.000},
				{-822.665,-474.940,10.000},
				{-871.687,-490.214,10.000},
				{-922.249,-505.616,10.000},
				{-974.363,-521.149,10.000},
				{-1028.045,-536.817,10.000},
				{-1083.308,-552.625,10.000},
				{-1140.165,-568.578,10.000},
				{-1198.633,-584.678,10.000},
				{-1258.727,-600.933,10.000},
				{-1320.461,-617.345,10.000},
				{-1383.853,-633.921,10.000},
				{-1448.920,-650.666,10.000},
				{-1515.678,-667.585,10.000},
				{-1584.147,-684.685,10.000},
				{-1654.344,-701.973,10.000},
				{-1726.289,-719.455,10.000},
				{-1800.003,-737.138,10.000},
				{-1875.506,-755.029,10.000},
				{-1952.820,-773.138,10.000},
				{-2031.967,-791.473,10.000},
				{-2112.972,-810.043,10.000},
				{-2195.857,-828.858,10.000},
				{-2280.650,-847.928,10.000},
				{-2367.377,-867.265,10.000},
				{-2456.065,-886.880,10.000},
				{-2546.743,-906.787,10.000},
				{-2639.443,-926.999,10.000},
				{-2734.196,-947.530,10.000},
				{-2831.036,-968.397,10.000},
				{-2929.998,-989.617,10.000},
				{-3031.118,-1011.207,10.000},
				{-3134.437,-1033.186,10.000},
				{-3239.994,-1055.576,10.000},
				{-3347.834,-1078.398,10.000},
				{-3458.002,-1101.676,10.000},
				{-3570.545,-1125.436,10.000},
				{-3685.516,-1149.706,10.000},
				{-3802.967,-1174.514,10.000},
				{-3922.957,-1199.892,10.000},
				{-4045.544,-1225.875,10.000},
				{-4170.794,-1252.497,10.000},
				{-4298.774,-1279.799,10.000},
				{-4429.556,-1307.823,10.000},
				{-4563.217,-1336.612,10.000},
				{-4699.839,-1366.216,10.000},
				{-4839.507,-1396.685,10.000},
				{-4982.315,-1428.076,10.000},
				{-5128.360,-1460.446,10.000},
				{-5277.745,-1493.858,10.000},
				{-5430.583,-1528.380,10.000},
				{-5586.992,-1564.083,10.000},
				{-5747.096,-1601.043,10.000},
				{-5911.030,-1639.339,10.000},
				{-6078.935,-1679.055,10.000},
				{-6250.964,-1720.280,10.000},
				{-6427.274,-1763.106,10.000},
				{-6608.037,-1807.628,10.000},
				{-6793.431,-1853.942,10.000},
				{-6983.646,-1902.149,10.000},
				{-7178.881,-1952.347,10.000},
				{-7379.344,-2004.632,10.000},
				{-7585.253,-2059.095,10.000},
				{-7796.836,-2115.821,10.000},
				{-8014.324,-2174.881,10.000},
				{-8237.957,-2236.329,10.000},
				{-8467.976,-2300.196,10.000},
				{-8704.624,-2366.482,10.000},
				{-8948.139,-2435.148,10.000},
				{-9198.750,-2506.105,10.000},
				{-9456.670,-2579.202,10.000},
				{-9722.092,-2654.218,10.000},
				{-9995.176,-2730.842,10.000},
				{-10276.043,-2808.668,10.000},
				{-10564.760,-2887.178,10.000},
				{-10861.334,-2965.736,10.000},
				{-11165.692,-3043.582,10.000},
				{-11477.676,-3119.836,10.000},
				{-11797.026,-3193.504,10.000},
				{-12123.377,-3263.502,10.000},
				{-12456.245,-3328.686,10.000},
				{-12795.034,-3387.891,10.000},
				{-13139.033,-3439.989,10.000},
				{-13487.427,-3483.941,10.000},
				{-13839.313,-3518.861,10.000},
				{-14193.721,-3544.073,10.000},
				{-14549.636,-3559.155,10.000},
				{-14906.033,-3563.965,10.000},
				{-15261.899,-3558.661,10.000},
				{-15616.266,-3543.678,10.000},
				{-15968.237,-3519.704,10.000},
				{-16317.000,-3487.633,10.000},
				{-16661.851,-3448.504,10.000},
				{-17002.195,-3403.445,10.000},
				{-17337.556,-3353.612,10.000},
				{-17667.570,-3300.140,10.000},
				{-17991.980,-3244.101,10.000},
				{-18310.627,-3186.471,10.000},
				{-18623.439,-3128.115,10.000},
				{-18930.417,-3069.777,10.000},
				{-19231.624,-3012.076,10.000},
				{-19527.176,-2955.514,10.000},
				{-19817.224,-2900.483,10.000},
				{-20101.952,-2847.279,10.000},
				{-20381.563,-2796.111,10.000},
				{-20656.275,-2747.120,10.000},
				{-20926.313,-2700.383,10.000},
				{-21191.907,-2655.933,10.000},
				{-21453.283,-2613.763,10.000},
				{-21710.666,-2573.835,10.000},
				{-21964.276,-2536.091,10.000},
				{-22214.321,-2500.459,10.000},
				{-22461.007,-2466.853,10.000},
				{-22704.525,-2435.184,10.000},
				{-22945.061,-2405.358,10.000},
				{-23182.789,-2377.282,10.000},
				{-23417.876,-2350.866,10.000},
				{-23650.478,-2326.023,10.000},
				{-23880.745,-2302.675,10.000},
				{-24108.820,-2280.747,10.000},
				{-24334.837,-2260.174,10.000},
				{-24558.928,-2240.901,10.000},
				{-24781.216,-2222.882,10.000},
				{-25001.824,-2206.083,10.000},
				{-25220.872,-2190.480,10.000},
				{-25438.478,-2176.064,10.000},
				{-25654.762,-2162.838,10.000},
				{-25869.844,-2150.820,10.000},
				{-26083.849,-2140.045,10.000},
				{-26296.905,-2130.562,10.000},
				{-26509.149,-2122.442,10.000},
				{-26720.726,-2115.770,10.000},
				{-26931.665,-2109.386,10.000},
				{-27141.884,-2102.194,10.000},
				{-27351.324,-2094.401,10.000},
				{-27559.945,-2086.208,10.000},
				{-27767.726,-2077.809,10.000},
				{-27974.788,-2070.625,10.000},
				{-28181.393,-2066.047,10.000},
				{-28387.816,-2064.225,10.000},
				{-28594.347,-2065.314,10.000},
				{-28801.295,-2069.475,10.000},
				{-29008.981,-2076.865,10.000},
				{-29217.621,-2086.397,10.000},
				{-29427.312,-2096.914,10.000},
				{-29638.154,-2108.420,10.000},
				{-29850.241,-2120.866,10.000},
				{-30063.882,-2136.409,10.000},
				{-30286.792,-2229.098,10.000},
				{-30521.485,-2346.932,10.000},
				{-30766.356,-2448.717,10.000},
				{-31019.872,-2535.157,10.000},
				{-31280.570,-2606.977,10.000},
				{-31547.062,-2664.922,10.000},
				{-31818.038,-2709.758,10.000},
				{-32092.265,-2742.273,10.000},
				{-32368.594,-2763.287,10.000},
				{-32645.958,-2773.640,10.000},
				{-32923.378,-2774.198,10.000},
				{-33199.961,-2765.836,10.000},
				{-33474.905,-2749.433,10.000},
				{-33747.490,-2725.856,10.000},
				{-34017.085,-2695.951,10.000},
				{-34283.138,-2660.527,10.000},
				{-34545.173,-2620.347,10.000},
				{-34802.785,-2576.123,10.000},
				{-35055.635,-2528.503,10.000},
				{-35303.443,-2478.076,10.000},
				{-35545.979,-2425.361,10.000},
				{-35783.061,-2370.818,10.000},
				{-36014.545,-2314.841,10.000},
				{-36240.322,-2257.767,10.000},
				{-36460.309,-2199.878,10.000},
				{-36674.450,-2141.405,10.000},
				{-36882.704,-2082.539,10.000},
				{-37085.046,-2023.426,10.000},
				{-37281.465,-1964.182,10.000},
				{-37471.954,-1904.892,10.000},
				{-37656.515,-1845.615,10.000},
				{-37835.154,-1786.393,10.000},
				{-38007.879,-1727.247,10.000},
				{-38174.698,-1668.187,10.000},
				{-38335.619,-1609.214,10.000},
				{-38490.651,-1550.320,10.000},
				{-38639.801,-1491.495,10.000},
				{-38783.073,-1432.724,10.000},
				{-38920.473,-1373.998,10.000},
				{-39052.004,-1315.305,10.000},
				{-39177.668,-1256.644,10.000},
				{-39297.470,-1198.017,10.000},
				{-39411.413,-1139.438,10.000},
				{-39519.506,-1080.930,10.000},
				{-39621.760,-1022.532,10.000},
				{-39718.189,-964.297,10.000},
				{-39808.819,-906.293,10.000},
				{-39893.679,-848.608,10.000},
				{-39972.814,-791.350,10.000},
				{-40046.279,-734.646,10.000},
				{-40114.143,-678.644,10.000},
				{-40176.495,-623.513,10.000},
				{-40233.439,-569.444,10.000},
				{-40285.104,-516.644,10.000},
				{-40331.637,-465.339,10.000},
				{-40373.214,-415.767,10.000},
				{-40410.032,-368.176,10.000},
				{-40442.314,-322.819,10.000},
				{-40470.308,-279.947,10.000},
				{-40494.289,-239.805,10.000},
				{-40514.551,-202.624,10.000},
				{-40531.412,-168.612,10.000},
				{-40545.207,-137.950,10.000},
				{-40556.286,-110.787,10.000},
				{-40565.009,-87.229,10.000},
				{-40571.743,-67.342,10.000},
				{-40576.858,-51.143,10.000},
				{-40580.718,-38.602,10.000},
				{-40583.682,-29.643,10.000},
				{-40586.096,-24.144,10.000},
				{-40588.291,-21.944,10.000},
				{-40590.575,-22.845,10.000},
				{-40593.237,-26.617,10.000},
				{-40596.538,-33.011,10.000},
				{-40600.714,-41.757,10.000},
				{-40605.972,-52.580,10.000},
				{-40612.492,-65.197,10.000},
				{-40620.425,-79.331,10.000},
				{-40629.896,-94.711,10.000},
				{-40641.004,-111.079,10.000},
				{-40653.823,-128.191,10.000},
				{-40668.405,-145.822,10.000},
				{-40684.781,-163.765,10.000},
				{-40702.965,-181.835,10.000},
				{-40722.951,-199.864,10.000},
				{-40744.722,-217.708,10.000},
				{-40768.246,-235.241,10.000},
				{-40793.482,-252.353,10.000},
				{-40820.377,-268.955,10.000},
				{-40848.874,-284.970,10.000},
				{-40878.908,-300.338,10.000},
				{-40910.409,-315.012,10.000},
				{-40943.304,-328.953,10.000},
				{-40977.518,-342.135,10.000},
				{-41012.972,-354.540,10.000},
				{-41049.587,-366.157,10.000},
				{-41087.286,-376.981,10.000},
				{-41125.987,-387.014,10.000},
				{-41165.613,-396.262,10.000},
				{-41206.086,-404.732,10.000},
				{-41247.330,-412.437,10.000},
				{-41289.269,-419.391,10.000},
				{-41331.830,-425.611,10.000},
				{-41374.941,-431.113,10.000},
				{-41418.533,-435.917,10.000},
				{-41462.537,-440.042,10.000},
				{-41506.888,-443.506,10.000},
				{-41551.521,-446.330,10.000},
				{-41596.374,-448.534,10.000},
				{-41641.388,-450.136,10.000},
				{-41686.503,-451.156,10.000},
				{-41731.665,-451.612,10.000},
				{-41776.817,-451.523,10.000},
				{-41821.908,-450.906,10.000},
				{-41866.886,-449.779,10.000},
				{-41911.701,-448.157,10.000},
				{-41956.307,-446.057,10.000},
				{-42000.656,-443.494,10.000},
				{-42044.705,-440.482,10.000},
				{-42088.408,-437.035,10.000},
				{-42131.725,-433.167,10.000},
				{-42174.614,-428.890,10.000},
				{-42217.035,-424.217,10.000},
				{-42258.951,-419.160,10.000},
				{-42300.324,-413.729,10.000},
				{-42341.118,-407.935,10.000},
				{-42381.297,-401.790,10.000},
				{-42420.827,-395.302,10.000},
				{-42459.675,-388.482,10.000},
				{-42497.809,-381.339,10.000},
				{-42535.197,-373.882,10.000},
				{-42571.809,-366.119,10.000},
				{-42607.615,-358.060,10.000},
				{-42642.587,-349.713,10.000},
				{-42676.695,-341.085,10.000},
				{-42709.914,-332.186,10.000},
				{-42742.216,-323.023,10.000},
				{-42773.576,-313.604,10.000},
				{-42803.970,-303.937,10.000},
				{-42833.373,-294.030,10.000},
				{-42861.762,-283.892,10.000},
				{-42889.115,-273.529,10.000},
				{-42915.410,-262.952,10.000},
				{-42940.627,-252.166,10.000},
				{-42964.745,-241.181,10.000},
				{-42987.746,-230.006,10.000},
				{-43009.611,-218.648,10.000},
				{-43030.322,-207.117,10.000},
				{-43049.864,-195.421,10.000},
				{-43068.221,-183.569,10.000},
				{-43085.378,-171.570,10.000},
				{-43101.322,-159.434,10.000},
				{-43116.039,-147.170,10.000},
				{-43129.517,-134.787,10.000},
				{-43141.747,-122.295,10.000},
				{-43152.717,-109.705,10.000},
				{-43162.420,-97.025,10.000},
				{-43170.846,-84.267,10.000},
				{-43177.991,-71.441,10.000},
				{-43183.846,-58.556,10.000},
				{-43188.409,-45.624,10.000},
				{-43191.674,-32.654,10.000},
				{-43193.768,-20.946,10.000},
				{-43194.950,-11.812,10.000},
				{-43195.477,-5.277,10.000},
				{-43195.612,-1.343,10.000},
				{-43195.613,-0.014,10.000},
				{-43195.613,-0.000,10.000}
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