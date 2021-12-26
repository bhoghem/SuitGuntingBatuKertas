import java.util.*

class App {
    fun run(){
printheader()
        inputMenu()

    }

    private fun inputMenu() {
        println("1.Pemain Satu Pilih:")
        val pemainSatu: String? = readLine()
        println("2.Pemain Dua Pilih:")
        val pemainDua: String? = readLine()
        var status = false
        if (pemainDua!!.lowercase(Locale.getDefault()).equals(pemainSatu?.lowercase(Locale.getDefault()))) {
            println("Seri $pemainSatu dengan $pemainDua")
        } else if (pemainDua.lowercase(Locale.getDefault()).equals("batu")) {
            if (pemainSatu?.lowercase(Locale.getDefault()).equals("gunting")) {
                status = true
                hasil(status, pemainDua, pemainSatu)
            } else {
                status = false
                hasil(status, pemainDua, pemainSatu)
            }
        } else if (pemainDua.lowercase(Locale.getDefault()).equals("gunting")) {
            if (pemainSatu?.lowercase(Locale.getDefault()).equals("kertas")) {
                status = true
                hasil(status, pemainDua, pemainSatu)
            } else {
                status = false
                hasil(status, pemainDua, pemainSatu)
            }
        } else if (pemainDua.lowercase(Locale.getDefault()).equals("kertas")) {
            if (pemainSatu?.lowercase(Locale.getDefault()).equals("batu")) {
                status = true
                hasil(status, pemainDua, pemainSatu)
            } else {
                status = false
                hasil(status, pemainDua, pemainSatu)
            }
        }
    }

    fun hasil(status: Boolean, p1: String, p2: String?) {
        if (status) {
            println("yah Kamu Kalah Pemain Satu!! $p1 mengalahkan $p2, Selamat Pemain Dua")
        } else {
            println("Hore Kamu Menang pemain Satu!! $p2 mengalahkan $p1, Semangat Pemain Dua!!")

        }

    }

    private fun printheader() {
println("===============================")
        println("Aplikasi Gunting, Batu, Kertas")
        println("===============================")
    }

companion object{
    @JvmStatic
    fun main(args: Array<String>) {
App().run()
    }
}
}