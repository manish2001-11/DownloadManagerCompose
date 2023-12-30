package com.mkdev.downloadmanager

interface Downloader {

    fun downloadFile(url:String) :Long
}