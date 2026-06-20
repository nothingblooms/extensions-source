package eu.kanade.tachiyomi.extension.en.lgbtics

import eu.kanade.tachiyomi.multisource.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Lgbtics : Madara(
    "Lgbtics", 
    "https://lgbtics.com", 
    "en"
) {
    override val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.US)
}
