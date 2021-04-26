package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Samsul Arifin", "Laki-Laki", "samsul@stimata.ac.id", "08123456789", "Malang"))
        listTeman.add(MyFriend("Komang Damai", "Laki-Laki", "damai@stimata.ac.id", "087123456789", "Sulawesi"))
        listTeman.add(MyFriend("Ulhaq Dhiya", "Perempuan", "ulhaq@stimata.ac.id", "08123456789", "Malang"))
        listTeman.add(MyFriend("Komang Damai", "Laki-Laki", "damai@stimata.ac.id", "087123456789", "Sulawesi"))
        listTeman.add(MyFriend("Samsul Arifin", "Laki-Laki", "samsul@stimata.ac.id", "08123456789", "Malang"))
        listTeman.add(MyFriend("Komang Damai", "Laki-Laki", "damai@stimata.ac.id", "087123456789", "Sulawesi"))
    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}