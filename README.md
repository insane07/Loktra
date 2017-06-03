# Loktra

Solution for below 2 taks:

Task 1

Write code to find a string of characters that contains only letters from

acdegilmnoprstuw

such that the hash(the_string) is

930846109532517

if hash is defined by the following pseudo-code:

Int64 hash (String s) {
    Int64 h = 7
    String letters = "acdegilmnoprstuw"
    for(Int32 i = 0; i < s.length; i++) {
        h = (h * 37 + letters.indexOf(s[i]))
    }
    return h
}
For example, if we were trying to find the 7 letter string where hash(the_string) was 680131659347, the answer would be "leepadg".


Solution: ReverseHash.java


Task 2 -Python URI task

In Python, write a class or module with a bunch of functions for manipulating a URI. For this exercise, pretend that the urllib, urllib2, and urlparse modules don't exist. You can use other standard Python modules, such as re, for this. The focus of the class or module you write should be around usage on the web, so you'll want to have things that make it easier to update or append a querystring var, get the scheme for a URI, etc., and you may want to include ways to figure out the domain for a URL (british-site.co.uk, us-site.com, mailto: yourname@example.com, etc.)

We're looking for correctness (you'll probably want to read the relevant RFCs; make sure you handle edge cases), and elegance of your API (does it let you do the things you commonly want to do with URIs in a really straightforward way?,) as well as coding style. If you don't know Python already, then this is also an exercise in learning new things quickly and well. Your code should be well-commented and documented and conform to the guidelines in the PEP 8 Style Guide for Python Code. Include some instructions and examples of usage in your documentation. You may also want to write unit tests.

Solution: UriParser.py
