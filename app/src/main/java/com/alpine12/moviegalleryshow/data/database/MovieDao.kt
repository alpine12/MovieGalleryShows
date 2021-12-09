package com.alpine12.moviegalleryshow.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movie: MovieEntity)

    @Query("select * from movie_table order by dateSaved ASC")
    fun getMovieSaved(): Flow<List<MovieEntity>>


}