/**
 * Created by mikel on 21/08/2016.
 */

#include "TimeJni.h"
#include "TimeProvider.h"
#include <android/log.h>

JNIEXPORT jstring JNICALL
Java_com_akaita_example_nativeapi_Time_nowNative(JNIEnv *env) {
    __android_log_print(ANDROID_LOG_ERROR, "Test tag", "test");
#ifdef DEBUG
    __android_log_print(ANDROID_LOG_ERROR, "Test tag", "Debug on");
#endif

    std::string time = TimeProvider::getTime();
    return env->NewStringUTF(time.c_str());
}
