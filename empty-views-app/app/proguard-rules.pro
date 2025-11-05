# ProGuard rules for the Empty Views App

# Keep the application class
-keep class com.example.emptyviewsapp.MainApplication { *; }

# Keep the main activity
-keep class com.example.emptyviewsapp.MainActivity { *; }

# Keep the video engine class
-keep class com.example.emptyviewsapp.video.VideoEngine { *; }

# Keep the AI captain service class
-keep class com.example.emptyviewsapp.ai.AICaptainService { *; }

# Keep all model classes used in TensorFlow Lite
-keep class * extends org.tensorflow.lite.** { *; }

# Keep all classes used in ML Kit
-keep class com.google.mlkit.** { *; }

# Keep all classes used in FFmpeg
-keep class com.arthenica.ffmpegkit.** { *; }

# Keep all public methods and fields
-keep public class * {
    public *;
}

# Keep all annotations
-keepattributes *Annotation*