package kg.tutorialapp.mystudy_2

object Data {
    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_android_24),
        Item(2, "Kotlin", R.drawable.ic_baseline_adb_24),
        Item(3, "Dart", R.drawable.ic_baseline_coronavirus_24)
    )

    fun getLongListOfItems(): MutableList<Item>{
        val list = mutableListOf<Item>()
        for (i in 0..50){
            list.addAll(items)
        }
        return  list
    }
}