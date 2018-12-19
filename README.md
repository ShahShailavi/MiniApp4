# MiniApp4
MiniApplication 4 to identify time taken to download particular file using ViewModel in Kotlin

Modify Mini-App3 to store data in a ViewModel and display it using a data binding layout

ViewModel:
    Create a ViewModel class to hold the network speed, file size, and transfer time.
    Since the transfer time will be updated based on the values of the other two fields, it will need to be Obesrvable and LiveData type.
    
Data Binding:
    Modify the fragment or activity to create the ViewModel object, inflate the layout and retrieve the binding, and assign the ViewModel object to a property in the binding class.
    
