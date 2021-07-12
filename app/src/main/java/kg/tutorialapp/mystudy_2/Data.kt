package kg.tutorialapp.mystudy_2

object Data {
    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_android_24),
        Item(2, "Kotlin", R.drawable.ic_baseline_adb_24),
        Item(3, "Dart", R.drawable.ic_baseline_coronavirus_24)
    )

    val itemDetails = listOf<ItemDetails>(
        ItemDetails(1,"Java", R.drawable.ic_baseline_android_24, "Sun Microsystems", "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible."),
        ItemDetails(2,"Kotlin", R.drawable.ic_baseline_adb_24, "JetBrains", "Kotlin (/ˈkɒtlɪn/)[6] is a cross-platform, statically typed, general-purpose programming language with type inference."),
        ItemDetails(3,"Dart", R.drawable.ic_baseline_coronavirus_24, "Google", "Dart is a programming language designed for client development,[9][10] such as for the web and mobile apps.")
    )

    fun getLongListOfItems(): MutableList<Any>{
        val list = mutableListOf<Any>()
        for (i in 0..100){
            list.addAll(items)
            if(i % 3 == 0)
                list.add("https://positivepsychology.com/what-is-motivation/")
        }
        return  list
    }
}