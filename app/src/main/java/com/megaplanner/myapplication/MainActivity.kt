package com.megaplanner.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    fun ClosedRange<Int>.random() =
            Random().nextInt(endInclusive - start) +  start

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i: Int
        var j:Int
        var a:Array<Array<Int>> = Array(10,{Array(10,{10000})})
        var b:Array<Int> = Array(180,{0})
        var k:Int=0
        var n: Int = 0
        for (i in 0..70)
        {
            n=(0..180).random()
            if (n<90) {
                a[n/9][n%9]=a[n/9][n%9]/1000*1000+a[n/9][n%9]%100+200
                a[n/9][n%9+1]=a[n/9][n%9+1]/10*10+4
            }
            else {n=n-90
                a[n%9][n/9]=a[n%9][n/9]/100*100+a[n%9][n/9]%10+30
                a[n%9+1][n/9]=a[n%9+1][n/9]/10000*10000+a[n%9+1][n/9]%1000+1000
            }
            b[n]=1;

        }
        for (i in 0..10){for (j in 0..10){
            if (a[i][j]%10!=0) k=k+1;
            if(a[i][j]%100-a[i][j]%10!=0)k=k+1;
            if(a[i][j]%1000-a[i][j]%100!=0) k=k+1;
            a[i][j]=10000*k+a[i][j]%10000
        k=0}
        }
    }



}
