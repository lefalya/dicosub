package com.example.dicodingsubmissionberninofalya

object PlanesData {
    private val name = arrayOf(
        "A220-100",
        "A220-300",
        "A318",
        "A319neo",
        "A320neo",
        "A321neo",
        "A330-200",
        "A330-300",
        "A330-800",
        "A330-900"
    )

    private val shortDescription = arrayOf(
        "Purpose built for eficiency",
        "A flexible and comfortable cabin",
        "Commonality where it counts",
        "Focus on commonality",
        "Unbeatable fuel efficiency",
        "Increased revenue potential",
        "Powering into the future",
        "Long-haul comfort",
        "The entry-level wide-body",
        "Highly efficient operations"
    )

    private val photo = intArrayOf(
        R.drawable.a220_100,
        R.drawable.a220_300,
        R.drawable.a318,
        R.drawable.a319neo,
        R.drawable.a320neo,
        R.drawable.a321neo,
        R.drawable.a330_200,
        R.drawable.a330_300,
        R.drawable.a330_800neo,
        R.drawable.a330_900neo)

    private val range = arrayOf(
        6297,
        6204,
        5750,
        6850,
        6300,
        7400,
        13450,
        11750,
        15100,
        13400
    )

    private val seating = arrayOf(
        "100-120",
        "120-150",
        "90-110",
        "120-150",
        "150-180",
        "180-220",
        "210-250",
        "250-290",
        "220-260",
        "260-300"
    )

    private val length = arrayOf(
        35.0,
        38.7,
        31.44,
        33.84,
        37.57,
        44.51,
        58.82,
        63.66,
        58.82,
        63.66
    )

    private val cabinLength = arrayOf(
        23.7,
        27.5,
        21.38,
        23.78,
        27.51,
        34.44,
        45.00,
        50.36,
        45.00,
        50.36
    )

    private val fuselageDiameter = arrayOf(
        3.5,
        3.5,
        3.95,
        3.95,
        3.95,
        3.95,
        5.64,
        5.64,
        5.64,
        5.64
    )

    private val cabinWidth = arrayOf(
        3.3,
        3.3,
        3.7,
        3.7,
        3.7,
        3.7,
        5.26,
        5.26,
        5.26,
        5.26
    )

    private val wingSpan = arrayOf(
        35.1,
        35.1,
        34.1,
        35.8,
        35.8,
        35.8,
        60.3,
        60.3,
        64.0,
        64.0
    )

    private val height = arrayOf(
        11.8,
        11.8,
        12.56,
        11.76,
        11.76,
        11.76,
        17.36,
        16.79,
        17.39,
        16.79
    )

    val listData : ArrayList<Plane>
    get(){
        val list = arrayListOf<Plane>()
        for (position in name.indices){
            val plane = Plane()
            plane.name = name[position]
            plane.shortDescription = shortDescription[position]
            plane.photo = photo[position]
            plane.range = range[position]
            plane.seating = seating[position]
            plane.length = length[position]
            plane.cabinlength = cabinLength[position]
            plane.fuselageDiameter = fuselageDiameter[position]
            plane.cabinWidth = cabinWidth[position]
            plane.wingspan = wingSpan[position]
            plane.height = height[position]

            list.add(plane)
        }
        return list
    }
}