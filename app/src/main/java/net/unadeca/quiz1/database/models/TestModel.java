package net.unadeca.quiz1.database.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import net.unadeca.quiz1.database.TestDatabase;

@Table(database = TestDatabase.class)
public class TestModel extends BaseModel {

    @PrimaryKey(autoincrement = true)
    public long id;


    @Column
    public String name;

    @Column
    public String last_name;
}
