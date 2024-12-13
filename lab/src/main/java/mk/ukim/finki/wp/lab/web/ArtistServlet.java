package mk.ukim.finki.wp.lab.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "artist-servlet", urlPatterns = "/artist")
public class ArtistServlet extends HttpServlet {
    private final ArtistService artistService;
    private final SongService songService;
    private final SpringTemplateEngine springTemplateEngine;

    public ArtistServlet(ArtistService artistService, SongService songService, SpringTemplateEngine springTemplateEngine) {
        this.artistService = artistService;
        this.songService = songService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Artist> artists = artistService.listArtists();
        String trackId = req.getParameter("trackId");
        String artistId = req.getParameter("artistId");
//        Song song = songService.findByTrackId(trackId);

        IWebExchange webExchange = JakartaServletWebApplication.buildApplication(getServletContext()).buildExchange(req, resp);
        WebContext context = new WebContext(webExchange);

        context.setVariable("artists", artists);
        context.setVariable("selectedTrackId", trackId);
//        context.setVariable("song", song);

        springTemplateEngine.process("artistsList.html", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String trackId = req.getParameter("trackId");
        String artistId = req.getParameter("artistId");

        if (artistId==null || artistId.isEmpty()){
            resp.sendRedirect("/artist?trackId=" + trackId);
            return;
        }

        resp.sendRedirect("/songDetails?filter=" + trackId + "&filter=" + artistId);
    }
}