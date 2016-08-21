#include <jni.h>

extern "C" {

JNIEXPORT jstring JNICALL
        Java_com_akaita_example_nativeapi_Time_nowNative(JNIEnv *env);
}