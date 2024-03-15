# LiveData Android Project

This Android project focuses on demonstratinq the implementation of LiveData
and ViewModel to facilitate data management and UI updates.

## Overview

The project consists of two key components: `MainViewModel` and its corresponding unit test. 

### MainViewModel

The `MainViewModel` class, located in the `com.shrey.live_data` package, serves
as the central data handler for the application. It extends the `ViewModel`
class from the Android Architecture Components library and utilizes LiveData to
manage the current galaxy name.

### LiveData Usage

LiveData is employed to encapsulate the galaxy name data and ensure that
changes to the data are observed by any UI components that are interested. The
ViewModel exposes a LiveData object named `galaxyLive`, which holds the current
galaxy name. Additionally, a function named `updateLiveData()` is provided to
update the LiveData value.

## How to Use

To integrate LiveData into your Android project:

1. Create a ViewModel class that extends the ViewModel class.
2. Use MutableLiveData to store and manage data that needs to be observed.
3. Expose LiveData objects to allow UI components to observe data changes.
4. Update data using MutableLiveData's `setValue()` or `postValue()` methods.

