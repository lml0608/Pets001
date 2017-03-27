package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by lfs-ios on 2017/3/27.
 */

public final class PetContract {

    private PetContract(){}

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    public static final Uri BASE_CONTENT_URL = Uri.parse("content://" + CONTENT_AUTHORITY);



    public static final String PATH_PETS = "pets";

    public static final class PetEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URL, PATH_PETS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        //表名
        public final static String TABLE_NAME = "pets";


        //主键
        public final static String _ID = BaseColumns._ID;

        //pet的名字

        public final static String COLUMN_PET_NAME = "name";

        //pet的种类

        public final static String COLUMN_PET_BREED = "breed";

        //pet的性别

        public final static String COLUMN_PET_GENDER = "gender";


        //pet的体重

        public final static String COLUMN_PET_WEIGHT = "weight";


        //性别的选项
        //未知
        public static final int GENDER_UNKNOWN = 0;
        //雄性
        public static final int GENDER_MALE = 0;
        //雌性
        public static final int GENDER_FEMALE = 0;


        public static boolean isValidGender(int gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }

    }
}
