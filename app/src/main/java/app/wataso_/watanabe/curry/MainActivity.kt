package app.wataso_.watanabe.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("豪炎寺","円堂","基山","宇都宮")
    val food = arrayOf<String>("かれー","みそしる","チャーハン","えびちり")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(){

        val randomName = Random()
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name + "に"

        foodTextView.text = food[Random().nextInt(4)] +"を"

        if(Random().nextInt(100)<50){
            verbTextView.text = "よそえました＾＾"
        }else{
            verbTextView.text = "よそえませんでした"
        }
    }
}