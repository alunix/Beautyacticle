package com.nicodelee.beautyarticle.mode;

import com.nicodelee.beautyarticle.db.ActicleDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * Created by Lin on 15/3/26.
 */
@Table(databaseName = ActicleDatabase.NANE)
public class ActicleMod extends BaseMod{

    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column(name = "title")
    public String title;

    @Column(name = "image")
    public String image;

    @Column(name = "details")
    public String details;

    @Column(name = "descriptions")
    public String descriptions;

}
