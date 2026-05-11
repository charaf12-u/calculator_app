package com.example.calculator

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    // declarer les variable par lateinit
    lateinit var result : TextView
    lateinit var moadala: TextView
    lateinit var equal : Button
    lateinit var point : Button
    lateinit var kaws : Button
    lateinit var baki : Button
    lateinit var kisma: Button
    lateinit var jam3 : Button
    lateinit var tar7 : Button
    lateinit var darb : Button
    lateinit var a1 : Button
    lateinit var a2 : Button
    lateinit var a3 : Button
    lateinit var a4 : Button
    lateinit var a5 : Button
    lateinit var a6 : Button
    lateinit var a7 : Button
    lateinit var a8 : Button
    lateinit var a9 : Button
    lateinit var a0 : Button
    lateinit var ac : Button

    lateinit var a :String


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // get les valuer de variable
        moadala=findViewById(R.id.Text2)
        result=findViewById(R.id.Text1)
        kisma=findViewById(R.id.kisma)
        equal=findViewById(R.id.equal)
        point=findViewById(R.id.point)
        darb=findViewById(R.id.jodae)
        jam3=findViewById(R.id.jam3)
        tar7=findViewById(R.id.tarh)
        kaws=findViewById(R.id.kaws)
        baki=findViewById(R.id.baki)
        ac=findViewById(R.id.ac)
        a0=findViewById(R.id.a0)
        a1=findViewById(R.id.a1)
        a2=findViewById(R.id.a2)
        a3=findViewById(R.id.a3)
        a4=findViewById(R.id.a4)
        a5=findViewById(R.id.a5)
        a6=findViewById(R.id.a6)
        a7=findViewById(R.id.a7)
        a8=findViewById(R.id.a8)
        a9=findViewById(R.id.a9)

        // ajoute contextMenu dans kaws
        registerForContextMenu(kaws)


        // par click sur button
        ac.setOnClickListener {
            result.setTextColor(getColor(R.color.colorresult))
            result.textSize=30f
            moadala.setText("")
            result.setText("0.0")
        }
        a1.setOnClickListener {
            a = moadala.text.toString()
            a=a+"1"
            moadala.setText(a)
            tahakok()
        }
        a2.setOnClickListener {
            a = moadala.text.toString()
            a=a+"2"
            moadala.setText(a)
            tahakok()
        }
        a3.setOnClickListener {
            a = moadala.text.toString()
            a=a+"3"
            moadala.setText(a)
            tahakok()
        }
        a4.setOnClickListener {
            a = moadala.text.toString()
            a=a+"4"
            moadala.setText(a)
            tahakok()
        }
        a5.setOnClickListener {
            a = moadala.text.toString()
            a=a+"5"
            moadala.setText(a)
            tahakok()
        }
        a6.setOnClickListener {
            a = moadala.text.toString()
            a=a+"6"
            moadala.setText(a)
            tahakok()
        }
        a7.setOnClickListener {
            a = moadala.text.toString()
            a=a+"7"
            moadala.setText(a)
            tahakok()
        }
        a8.setOnClickListener {
            a = moadala.text.toString()
            a=a+"8"
            moadala.setText(a)
            tahakok()
        }
        a9.setOnClickListener {
            a = moadala.text.toString()
            a=a+"9"
            moadala.setText(a)
            tahakok()
        }
        a0.setOnClickListener {
            a = moadala.text.toString()
            a=a+"0"
            moadala.setText(a)
            tahakok()
        }
        point.setOnClickListener {
            a = moadala.text.toString()
            a=a+"."
            moadala.setText(a)
            tahakok()
        }
        kisma.setOnClickListener {
            a = moadala.text.toString()
            a=a+"/"
            moadala.setText(a)
            tahakok()
        }
        jam3.setOnClickListener {
            a = moadala.text.toString()
            a=a+"+"
            moadala.setText(a)
            tahakok()

        }
        tar7.setOnClickListener {
            a = moadala.text.toString()
            a=a+"-"
            moadala.setText(a)
            tahakok()
        }
        darb.setOnClickListener {
            a = moadala.text.toString()
            a=a+"*"
            moadala.setText(a)
            tahakok()
        }
        baki.setOnClickListener {
            a = moadala.text.toString()
            a=a+"%"
            moadala.setText(a)
            tahakok()
        }
        equal.setOnClickListener {
            a = moadala.text.toString()
            try {
                val resul = evaluateExpression(a)
                result.text = resul.toString()
            } catch (e: Exception) {
                result.textSize=18f
                result.text = e.message
            }
            moadala.setText("")
            result.setTextColor(Color.WHITE)

        }


    }

    fun kawsleft() {
        moadala=findViewById(R.id.Text2)
        var a = moadala.text.toString()
        a=a+"("
        moadala.setText(a)
        tahakok()
    }
    fun kawsreight() {
        moadala=findViewById(R.id.Text2)
        var a = moadala.text.toString()
        a=a+")"
        moadala.setText(a)
        tahakok()
    }
    // function evaluateExpression lihisab lmo3adala
    private fun evaluateExpression(expression: String): Double {
        return ExpressionBuilder(expression).build().evaluate()
    }
    // tahaKOK mina 7al lmo3adala (yomkin aw la yomkin)
    fun tahakok(){
        result.setTextColor(getColor(R.color.colorresult))
        result.textSize=30f


        a = moadala.text.toString()
        try {
            val resul = evaluateExpression(a)
            result.text = resul.toString()
        } catch (e: Exception) {

            result.text = ""
        }
    }
    // create context menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu_par_akwas,menu)

    }
    // click sur un item
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.kawsleft -> kawsleft()
            R.id.kawsreight -> kawsreight()
        }
        return super.onContextItemSelected(item)
    }

}




















