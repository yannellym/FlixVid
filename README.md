# FlixVid

# Update #1: March 20, 2023 
Android Project 4 - FlixVid+

Submitted by: Yannelly Mercado

FlixVid+ is a movie browsing app that allows users to browse the most popular movies of the week. It
also allows users to see an activity screen with additional information about the movies. Users can find
out if the movie is for adults, when it was released, and how many votes it has gotten. This can help users 
make a better decision when it comes to what movie they should watch.

Time spent: 20+ hours spent in total

## Required Features

The following **required** functionality is completed:

- [X] **Choose any endpoint on The MovieDB API except `now_playing`**
  - Chosen Endpoint: `Trending/Movie/Week`
- [X] **Make a request to your chosen endpoint and implement a RecyclerView to display all entries**
- [X] **Use Glide to load and display at least one image per entry**
- [X] **Click on an entry to view specific details about that entry using Intents**

The following **optional** features are implemented:

- [ ] **Add another API call and RecyclerView that lets the user interact with different data.**
- [x] **Add rounded corners to the images using the Glide transformations**
- [ ] **Implement a shared element transition when user clicks into the details of a movie**

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExOTFjMGRkYWJlY2ExM2I3ZjFiNTYyOWVmYzkyZjU2YjZkNThkYjYxZSZjdD1n/EX7aQRK7ZDOG77Iwu6/giphy.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<!-- Replace this with whatever GIF tool you used! -->
GIF created with Giphy
<!-- Recommended tools:
[Kap](https://getkap.co/) for macOS
[ScreenToGif](https://www.screentogif.com/) for Windows
[peek](https://github.com/phw/peek) for Linux. -->

## Notes

I struggled with this phase of the app as I was unsure of how to render the second page. I was also unsure of the
serialization of the data. However, after many hours and a lot of try/fail attempts, I was able to connect it all together. 

# Creation Date: March 13, 2013

# Android Project 3 - FlixVid+

Submitted by: Yannelly Mercado

**Name of your app** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: 10+

## Required Features

The following **required** functionality is completed:

- [X] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [X] **Parse through JSON data and implement a RecyclerView to display all movies**
- [X] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [ ] Improve and customize the user interface through styling and coloring
- [ ] Implement orientation responsivity
    - App should neatly arrange data in both landscape and portrait mode
- [X] Implement Glide to display placeholder graphics during loading
    - Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)


## Video Walkthrough

Here's a walkthrough of implemented user stories:

Loading <img src='https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExODg3YWMzYjY3ODEzNmZjM2MwMTM1MWE0M2RjNjIxMGI5NzFkM2ExMiZjdD1n/MtOyQnbdAeL6gwgeWC/giphy.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' /> Data rendering <img src='https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExOWQ1MmU5ZTJkZTNhN2FhYTgxN2IzMTQ4YzNmNjUyNTdjYjY0MTI2OSZjdD1n/7eq7GqZ9Jp7Ny1RPFY/giphy.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />


<!-- Replace this with whatever GIF tool you used! -->
GIF created with Giphy
<!-- Recommended tools:
[Kap](https://getkap.co/) for macOS
[ScreenToGif](https://www.screentogif.com/) for Windows
[peek](https://github.com/phw/peek) for Linux. -->

## Notes

I encountered the following challenges: being able to display all of the data in one column. I wasn't identifying the frid view on the code. I also had some trouble with parsing the JSON data but was able to read Kotlin's documentation and figure it out.

## License

    Copyright 2023 Yannelly Mercado

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.