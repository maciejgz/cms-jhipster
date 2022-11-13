package pl.mg.cms.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.persistence.Lob;

/**
 * A DTO for the {@link pl.mg.cms.domain.Book} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class BookDTO implements Serializable {

    private Long id;

    private String title;

    @Lob
    private byte[] quicklook;

    private String quicklookContentType;

    @Lob
    private byte[] bookFile;

    private String bookFileContentType;
    private Instant releaseDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getQuicklook() {
        return quicklook;
    }

    public void setQuicklook(byte[] quicklook) {
        this.quicklook = quicklook;
    }

    public String getQuicklookContentType() {
        return quicklookContentType;
    }

    public void setQuicklookContentType(String quicklookContentType) {
        this.quicklookContentType = quicklookContentType;
    }

    public byte[] getBookFile() {
        return bookFile;
    }

    public void setBookFile(byte[] bookFile) {
        this.bookFile = bookFile;
    }

    public String getBookFileContentType() {
        return bookFileContentType;
    }

    public void setBookFileContentType(String bookFileContentType) {
        this.bookFileContentType = bookFileContentType;
    }

    public Instant getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Instant releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BookDTO)) {
            return false;
        }

        BookDTO bookDTO = (BookDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, bookDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", quicklook='" + getQuicklook() + "'" +
            ", bookFile='" + getBookFile() + "'" +
            ", releaseDate='" + getReleaseDate() + "'" +
            "}";
    }
}
