package eu.europa.ec.eudi.wallet.storage

/**
 * Author: Ahmed Bel Hadj
 */

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

class SecureStorageManager(context: Context) {

    // Initialize EncryptedSharedPreferences
    private val sharedPreferences: SharedPreferences

    init {
        val masterKey = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        sharedPreferences = EncryptedSharedPreferences.create(
            context,
            "secure_sd_jwt_store", // Preference file name
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    // Store SD-JWT in EncryptedSharedPreferences
    fun storeSdJwt(key: String, sdJwt: String) {
        val editor = sharedPreferences.edit()
        editor.putString(key, sdJwt)
        editor.apply() // Apply changes asynchronously
    }

    // Retrieve SD-JWT from EncryptedSharedPreferences
    fun getSdJwt(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    // Remove SD-JWT from EncryptedSharedPreferences
    fun removeSdJwt(key: String) {
        val editor = sharedPreferences.edit()
        editor.remove(key)
        editor.apply()
    }

    // Check if a key exists
    fun containsKey(key: String): Boolean {
        return sharedPreferences.contains(key)
    }
}
