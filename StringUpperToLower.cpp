#include <iostream>
#include<string>

using namespace std;

int main() {
	string str;
	//Getting Input
    cout<<"Enter the string ";
    getline(cin,str);
    //Converting into Lower Case
	for(int j=0;j<str.length();j++)
		str[j]=tolower(str[j]);
	cout<<"The string in lower case: "<<str<<"\n";
}
